public class TriangularNumberChecker {
    public static void verify(long userNumber) {
        int result = 0;
        int cout = 0;

        while (true) {
            result = cout * (cout + 1) * (cout + 2);
            if (userNumber == result) {
                System.out.printf("O número %d é um número triangular!pois %d.%d.%d = %d", userNumber, cout, cout + 1, cout + 2, userNumber);
                return;
            } else if (result > userNumber) {
                   System.out.println("o número "+userNumber +" não é triangular!");
                   return;
            }
            result = 0;
            cout++;
        }
    }
}
