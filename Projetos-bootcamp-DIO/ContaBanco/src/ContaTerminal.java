import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Insira seu nome completo:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Digite o número da agência:");
        scan.nextLine();
        String agencyNumber = scan.next();
        System.out.println("Insira o número da sua conta:");
        int accountNumber = scan.nextInt();
        System.out.println("Digite o seu saldo:");
        double balance = scan.nextDouble();
        String message = "bem vindo ".concat(name)
                .concat(" sua agência é:")
                .concat(agencyNumber)
                .concat(" O número da sua conta é:")
                .concat(String.valueOf(accountNumber))
                .concat(" com um saldo de R$").concat(String.valueOf(balance));
        System.out.println(message);
        scan.close();


        //O desafio era justamente ter que usar concat, por isso não foi usado o printf com a mensagem formatada.



    }
}
