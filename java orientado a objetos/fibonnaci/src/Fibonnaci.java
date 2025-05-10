public class Fibonnaci {
    public static void generateSequenceInRange(int nTerm) {
        long [] terms = new long[nTerm];
        terms[0] = 1;
        terms[1] = 1;

        for(int i = 1; i < nTerm - 1; i++) {
            terms[i + 1] = terms[i] + terms[i - 1];
        }

        for(long number : terms) {
            if (number == terms[nTerm - 1]) {
                if(nTerm == 2) {
                    System.out.println("1,1");
                    return;
                }
                System.out.print(number);
                return;
            }
            System.out.print(number + ",");
        }
    }
}
