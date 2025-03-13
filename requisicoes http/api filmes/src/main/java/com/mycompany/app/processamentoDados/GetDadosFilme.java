package processamentoDados;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;

public class GetDadosFilme{

    public ReceberDadosFilme enviarDados(String filmeEscolhido) throws Exception{
        try{
            ReceberDadosFilme receberDados = new ReceberDadosFilme();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create("https://api.tvmaze.com/search/shows?q=" + URLEncoder.encode(filmeEscolhido,"UTF-8"))).build();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            ObjectMapper mapper = new ObjectMapper();
            List<ReceberDadosFilme> listaDados = mapper.readValue(response.body(), new TypeReference<List<ReceberDadosFilme>>() {});
            receberDados = listaDados.get(0);
            return receberDados;
        } catch(Exception e) {
            System.out.println("Um erro inesperado acontenceu, verifique se a série ou filme inserido exista e tente mais tarde.");
            e.getMessage();
            return null;
        }
    }
}