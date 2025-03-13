package com.mycompany.app;
import java.io.IOException;
public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("fato:");
        try{
            retornarFato fato = new retornarFato();
            Fato novoFato = fato.obterFato();
            System.out.println(novoFato.getFact());
        } catch(Exception error) {
            System.out.println("erro!");
        }
    }
}
