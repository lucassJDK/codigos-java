package com.mycompany.app;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class retornarFato{
    public Fato obterFato() throws Exception {
        Fato obterFato = new Fato();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://catfact.ninja/fact")).build();
        HttpResponse <String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        obterFato = mapper.readValue(response.body(),Fato.class);
        return obterFato;
    }

}