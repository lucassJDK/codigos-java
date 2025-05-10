public class Populacao {
    public static void calcularTempo(long populacao1,long populacao2) {
        int anos = 0;

        while(populacao1 < populacao2) {
            populacao1 += populacao1 * 0.03;
            populacao2 += populacao2 * 0.02;
            anos++;
        }
        System.out.println("irá demorar " + anos + " anos");
    }
}
