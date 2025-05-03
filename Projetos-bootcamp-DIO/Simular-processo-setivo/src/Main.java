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
         Main.getWages(candidates);



    }

    public static void getWages(String [][] candidates) {
        double []  wages = new double[candidates.length];
        int cout = 0;
        int positionCout = 0;

        for(String[] salary : candidates) {
            for(String values : salary) {
                if(cout % 2 != 0) {
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
        Main.selectBySalary(candidates,wages);
    }
    public static void selectBySalary(String [][] allCandidates,double[] wages) {
        String [] candidates = new String[5]; //Só pode passar no máximo 5 candidatos no processo seletivo
        int positionCount = 0;
        int counterTimes = 0;

        for(Double salary : wages) {
            if(positionCount == 5) break;
            counterTimes++;

            if(salary < 2000) {
                candidates[positionCount] = allCandidates[counterTimes - 1][0];
                positionCount++;
            }

        }

        if(positionCount < 5) { //Mesma lógica que o outro for,entretanto a prioridade de vagas é quem tem o salário < e apenas depois buscamos os iguais
             counterTimes = 0;
              for(Double salary : wages) {
                  if (positionCount == 5) break;
                  counterTimes++;

                  if (salary == 2000) {
                      candidates[positionCount] = allCandidates[counterTimes - 1][0];
                      positionCount++;
                  }
              }
              }
        String message = "";
        for (int i = 0; i < positionCount; i++) {
            if(i == positionCount - 1) {
                message += candidates[i].concat(".");
            }
            else if (i == positionCount - 2) {
                message += candidates[i].concat(" e ");
            } else {
                message += candidates[i].concat(",");
            }
        }
        System.out.printf("Os candidatos selecionados foram: %s",message);
        }

        }




