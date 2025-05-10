import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira até que termo da sequêcia você quer imprimir:");
        Scanner scan = new Scanner(System.in);
        int nTerm = scan.nextInt();
        Fibonnaci.generateSequenceInRange(nTerm);
    }
}
