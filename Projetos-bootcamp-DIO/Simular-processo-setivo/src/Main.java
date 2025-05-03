public class Main {
    public static void main(String[] args) {
        String [][] candidates = {
                {"Maria","1000"},
                {"João","3000"},
                {"Pedro","1200"},
                {"José","2000"},
                {"Ezequiel","9000"},
                {"Felipe","1400"},
                {"Alberto","7000"},
                {"ana","500"}
        };
         Main.selectBySalary(candidates);


    }

    public static void selectBySalary(String [][] candidates) {
        double []  wages = new double[candidates.length];
        int cout = 0;
        int positionCout = 0;

        for(String[] salary : candidates) {
            for(String values : salary) {
                if(cout % 2 != 0) {
                    if(positionCout == 5) {
                        break;
                    }
                    wages[positionCout] = Double.parseDouble(values);
                    positionCout++;
                }
                cout++;
            }
        }
        for(double salary : wages) {
            System.out.println(salary);
        }
        /*
        if (salary < 2000) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salary == 2000) {
            System.out.println("LIGAR PARA O CANDIDATO E PEDIR CONTRA OFERTA");
        } else {
            System.out.println("AGUARDAR COM OS DEMAIS");
        }
.
         */
    }

}

