import java.util.*;
public class FirsttwoDmatrix {
public static boolean search(int matrix[][], int key)
{
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[1].length; j++) {
            if(matrix[i][j]==key)
            {
                System.out.println("Found at cell : ("+i+","+j+")");
                return true;
            }
        }
    }
    System.out.println("KEY NOT FOUND!");
    return false;
}   

public static void main(String[] args) {
    int matrix[][]=new int [3][3];
    System.out.println("Enter the elements : ");
    Scanner xy = new Scanner (System.in);
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[2].length; j++) {
            matrix[i][j]=xy.nextInt();
        }
    }
    System.out.print("The matrix is of : \n");
    Scanner z =new Scanner (System.in);
    for (int j = 0; j < matrix.length; j++) {
        for (int j2 = 0; j2 < matrix[0].length; j2++) {
            System.out.print(matrix[j][j2]+" ");
        }
        System.out.println();
    }
    search(matrix, 5);

}
}
