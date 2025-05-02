public class Main {
    public static void main(String[] args) {
        Main.selectBySalary(3000);
    }

    public static void selectBySalary(double salary) {
        if (salary < 2000)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salary == 2000)
            System.out.println("LIGAR PARA O CANDIDATO E PEDIR CONTRA OFERTA");
        else
            System.out.println("AGUARDAR COM OS DEMAIS");
    }

}

