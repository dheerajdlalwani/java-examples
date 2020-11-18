import java.util.Scanner;
class Sort
{
    int [] sort(int x [])
    {
        int pos, cpos, t;
        for(pos = 0; pos <= (x.length)-2; pos++)
        {
            for(cpos = pos + 1; cpos <= (x.length)-1; cpos++)
            {
                if(x[pos] > x[cpos])
                {
                    t = x[pos];
                    x[pos] = x[cpos];
                    x[cpos] = t;
                }
            }
        }

        return x;
    }
}

public class ArraySort {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("  Enter the size of the array: ");
        int n = s.nextInt();

        int x [] = new int[n];

        for(int i = 0; i < x.length; i++)
        {
            System.out.print("  x[" + i + "] = ");
            x[i] = s.nextInt();
        }


        System.out.println("\n  Unorted array is: ");

        for(int i = 0; i < x.length; i++)
        {
            System.out.println("  x[" + i + "] = " + x[i] );
        }


        Sort srt = new Sort();

        int y[] = srt.sort(x);

        System.out.println("\n  Sorted array is: ");

        for(int i = 0; i < x.length; i++)
        {
            System.out.println("  x[" + i + "] = " + y[i] );
        }
        s.close();
    }
    
}
