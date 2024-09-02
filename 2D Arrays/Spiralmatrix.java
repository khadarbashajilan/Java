import java.util.*;
public class Spiralmatrix {
    public static void printSpiral(int matrix[][])
    {
        int StartRow=0;
        int Startcol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(StartRow<=endRow && Startcol<=endCol)
        {
            //top
            for (int j = Startcol; j <= endCol; j++) {
                System.out.print(matrix[Startcol][j]+" ");

            }
            System.out.println();
            
            //right
            for(int i = StartRow+1; i<=endRow; i++)
            {
                System.out.print(matrix[i][endCol]+" ");
            }
            System.out.println();
            
            //bottom
            for(int j = endCol-1; j>=Startcol; j--)
            {
                if(StartRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            System.out.println();
            
            //left
            for(int i=endRow-1;i>=StartRow+1;i--)
            {
                if(Startcol==endCol)
                {
                    break;
                }
                System.out.print(matrix[i][Startcol]+" ");
            }
            System.out.println();
            
            StartRow++; //1
            Startcol++; //1
            endCol--; //2
            endRow--; //2
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        printSpiral(matrix);
    }
}
