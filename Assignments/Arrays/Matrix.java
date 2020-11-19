import java.util.Scanner;

class MatrixOP
{
    void readMatrix(int arr[][], int rows, int columns)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("   Please enter the elements Row wise: ");
        for(int i = 0; i < rows; i++)
        {
            System.out.print("   ");
            for(int j = 0; j < columns; j++)
            {
                arr[i][j] = s1.nextInt();
            }
        }
    }

    void printMatrix(int arr[][], int rows, int columns)
    {
        System.out.println("   *************************");
        for(int i = 0; i < rows; i++)
        {
            System.out.print("   ");
            for(int j = 0; j < columns; j++)
            {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println("   *************************\n");
    }

    void addMatrix(int m1[][], int m2[][], int ans[][], int rows, int columns)
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                ans[i][j] = m1[i][j] + m2[i][j];
            }
        }
    }

    void subtractMatrix(int m1[][], int m2[][], int ans[][], int rows, int columns)
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                ans[i][j] = m1[i][j] - m2[i][j];
            }
        }
    }

    void multiplyMatrices(int m1[][] , int m2[][], int ans[][], int rows, int columns)
    {
        int sum = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                for(int k = 0; k < rows; k++)
                    sum += (m1[i][k] * m2[k][j]);

                ans[i][j] = sum;
                sum = 0;
            }
        }
    }


}


public class Matrix
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int rows1, columns1, rows2, columns2;
        System.out.print("   Rows in matrix 1: ");
        rows1 = s.nextInt();
        System.out.print("   Columns in matrix 1: ");
        columns1 = s.nextInt();
        System.out.print("   Rows in matrix 2: ");
        rows2 = s.nextInt();
        System.out.print("   Columns in matrix 2: ");
        columns2 = s.nextInt();
        int m1[][] = new int [rows1][columns1];
        int m2[][] = new int [rows2][columns2];
        int addSub[][] = new int [rows1][columns1];
        int mul[][] = new int [rows1][columns2];
        

        MatrixOP mop = new MatrixOP();
        System.out.println("   Enter matrix 1");
        mop.readMatrix(m1, rows1, columns1);
        System.out.println("   Printing matrix 1");
        mop.printMatrix(m1, rows1, columns1);
        System.out.println("   Enter matrix 2");
        mop.readMatrix(m2, rows2, columns2);
        System.out.println("\n   Printing matrix 2");
        mop.printMatrix(m2, rows2, columns2);
        System.out.println("\n   Adding matrix 1 & matrix 2");
        mop.addMatrix(m1, m2, addSub, rows1, columns1);
        mop.printMatrix(addSub, rows1, columns1);
        System.out.println("\n   Subtracting matrix 1 & matrix 2");
        mop.subtractMatrix(m1, m2, addSub, rows1, columns1);
        mop.printMatrix(addSub, rows1, columns1);
        
        if (columns1 != columns2)
        {
            System.out.println("\n   Multiplication not defined");
        }
        else
        {
            System.out.println("\n   Multiplying matrix 1 & matrix 2");
            mop.multiplyMatrices(m1, m2, mul, rows1, columns1);
            mop.printMatrix(mul, rows1, columns1);
        }

    }
}