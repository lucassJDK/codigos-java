import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira até que termo da sequêcia você quer imprimir:");
        Scanner scan = new Scanner(System.in);
        int nTerm = scan.nextInt();
        try {
            Fibonnaci.generateSequenceInRange(nTerm);
        } catch(ArrayIndexOutOfBoundsException e) {
              switch(nTerm) {
                  case 0:
                      System.out.println("insira um núero diferente de 0!");
                      break;
                  case 1:
                      System.out.println("1");
                      break;
                  case 2:
                      System.out.println("1,1");
                      break;
                  default:
                      System.out.println("um erro inesperado aconteceu,relate o erro e tente novamente mais tarde.");
              }
              }
        }
    }
