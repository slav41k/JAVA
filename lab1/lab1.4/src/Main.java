import java.util.Scanner;

public class Main
{

    public static int[][] multiplyMatrices(int[][] A, int[][] B)
    {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                for (int k = 0; k < colsA; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        return C;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scan.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scan.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scan.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scan.nextInt();

        if (colsA != rowsB)
        {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsA; j++)
            {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                matrixA[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rowsB; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                matrixB[i][j] = scan.nextInt();
            }
        }

        int[][] matrixC = multiplyMatrices(matrixA, matrixB);

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsB; j++)
            {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
