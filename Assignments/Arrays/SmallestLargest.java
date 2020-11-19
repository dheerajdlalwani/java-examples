import java.util.Scanner;

class Arrays 
{
    void storeArray(int a[])
    {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Array stored successfully.\n");
    }
    int smallest(int a[])
    {
        int min;
        min = a[0];
        for (int i = 0; i < a.length; i++ )
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }
    int largest(int a[])
    {
        int max;
        max = a[0];
        for (int i = 0; i < a.length; i++ )
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

}


public class SmallestLargest {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int l = s.nextInt();
        int ar [] = new int[l];
        Arrays a = new Arrays();
        System.out.println("Enter the elements: ");
        a.storeArray(ar);
        System.out.println("The smallest element is: " + a.smallest(ar)+ "\n");
        System.out.println("The largest element is: " + a.largest(ar)+ "\n");
    }
}