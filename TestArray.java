import java.util.Scanner;

public class TestArray 
{
    public static void main(String args [])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = s.nextInt();
        int x[] = new int[n];
        int i;
        for(i = 0; i < n; i++)
        {
            System.out.print("Enter element " + i + ": ");
            x[i] = s.nextInt();
        }
        for(i = 0; i < n; i++)
        {
            System.out.print("Element " + i + "= " + x[i] + "\n");
        }
        System.out.println("Length of the array is: " + x.length);

    }
    
}
