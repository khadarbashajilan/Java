import java.util.*;

public class Transpose_matrix {
    public static void PrintMatrix(int matrix[][]) {
        System.out.println("The matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void transpose(int matrix[][]) {
        int row = 2, col = 3;
        int transpose[][] = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = matrix[j][i];

                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
           
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 7 }, { 5, 6, 7 } };

        PrintMatrix(matrix);
        System.out.println();
        System.out.println();

        transpose(matrix);
    }
}
