import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        long userNumber = scan.nextLong();
        TriangularNumberChecker.verify(userNumber);
    }
}
