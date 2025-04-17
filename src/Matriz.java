import java.util.Arrays;

public class Matriz {
    private final int [][] matriz = new int[3][3];
    public Matriz(int [/* 9 */] numbers) {
        int line = 0;
        int column = 0;
        for (int i = 0; i <  numbers.length; i++) {

            if(column == 3) { line++; column = 0; }
            System.out.printf("linha %d coluna %d irá receber  %d \n ",line,column,numbers[i]);
            matriz[line] [column] = numbers[i];
            column++;
        }
    }
    public int calcularDet() {
        for(int[] n:matriz) {
            System.out.println(Arrays.toString(n));
        }
        return  matriz[0][0] * matriz[1][1] * matriz[2][2] +
                matriz[0][1]  * matriz[1][2] * matriz[2][0] +
                matriz[0][2] * matriz[1][0] * matriz[2][1] -
                matriz[0][1] * matriz[1][0] * matriz[2][2] -
                matriz[0][0] * matriz[1][2] * matriz[2][1] -
                matriz[0][2] * matriz[1][1] * matriz[2][0];


    }
}
