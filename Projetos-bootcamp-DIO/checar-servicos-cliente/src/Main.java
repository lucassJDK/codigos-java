import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o serviço a ser verificado:");
        Scanner scan = new Scanner(System.in);
        String service = scan.next();
        System.out.println("Insira os serviços do cliente:");
        //scan.next();
        String clientServices = scan.next();
        String [] services = clientServices.split(",");
        boolean found = false;
        
        for(String userService: services) {
            if(service.equals(userService)) {
                System.out.printf("O cliente possui o serviço %s",userService);
                found = true;
                return;
            }
        }
        if(!found) {
            System.out.printf("P cliente não tem o serviço %s",service);
        }

    }
}