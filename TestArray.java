import java.util.Scanner;

public class TestArray 
{
    public static void main(String args [])
    {
        Scanner S = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = S.nextInt();
        
        int x[] = new int[n];
        
        int i;
        S.close();
        for(i = 0; i < n; i++)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter element " + i + ": ");
            x[i] = s.nextInt();
            s.close();
        }
        
        for(i = 0; i < n; i++)
        {
            System.out.print("Element " + i + "= " + x[i] + "\n");
        }
        System.out.println("Length of the array is: " + x.length);
        
    }
    
}
