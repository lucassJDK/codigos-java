package com.mycompany.app;
import processamentoDados.*;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
      try{
    System.out.println("Insira o nome de uma série/filme:");
      Scanner scan = new Scanner(System.in);
      String nomeVideoEscolhido = scan.nextLine();
      GetDadosFilme obterDados = new GetDadosFilme();
      ReceberDadosFilme receberDados = obterDados.enviarDados(nomeVideoEscolhido);
      System.out.printf("informações:%n nome:%s %n gêneros:%s %n nota média: %.2f %n",receberDados.getShow().getName(),receberDados.getShow().getGenres(),receberDados.getShow().getRating().getAverage());
      } catch(Exception e) {
          e.printStackTrace();
         System.out.println("Houve um erro no servidor!tente novamente mais tarde");
     }
      
  }
}
