public class Vetor {
    public static void lerLinhaEValor(int [] numbers) {
        int cout = 0;
        for(int number : numbers) {
            System.out.printf("na posição %d tem o valor %d \n",cout,number);
            cout++;
        }
    }
}
