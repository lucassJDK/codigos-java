import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[9];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.printf("Insira o número que ficará na posição a%d:", i + 1 );
            int num = scan.nextInt();
            numbers[i] = num;
        }

        Matriz matriz = new Matriz(numbers);
        System.out.println("a determinante é: " + matriz.calcularDet());
    }
}