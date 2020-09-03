import java.util.Scanner;

class Prime
{
    private int num,i;

    public Prime()
    {

    }

    public Prime(int n)
    {
        num = n;
        System.out.println("I got here, printed num: " + num);
    }

    public int primeCheck()
    {
        if(num == 1)
        {
            System.out.println("Nope");
            System.out.println("I got here(means num = 1), printed num: " + num);
            return 0;
        }
        else
        {
            for(i = 2; i < num-1;i++)
            {
                if(num % i == 0)
                {
                    System.out.println("Reached 1st factor " + i);
                    break;
                }
            }
            if(i <= num-1)
                {
                    System.out.println("Nope");
                    System.out.println("I got here (if), printed i: " + i);
                    System.out.println("I got here (if), printed num: " + num);
                    return 0;
                }
                else
                {
                    System.out.println("Fuck yeah");
                    System.out.println("I got here (else), printed num: " + num);
                    System.out.println("I got here (else), printed i: " + i);
                    return 1;
                }
        }
    }
}

public class PrimeCheck 
{
    public static void main(String args[])
    {
        int number, output;
        Scanner X = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not.");
        number = X.nextInt();
        Prime A = new Prime(number);
        A.primeCheck();
        output = A.primeCheck();
        if(output == 1)
        {
            System.out.println(number + " is a Prime Number");
        }
        else if (output == 0)
        {
            System.out.println(number + " is not a Prime Number");
        }
        X.close();
    }
}