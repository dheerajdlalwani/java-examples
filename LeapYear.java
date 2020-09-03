import java.util.Scanner;

class Leap 
{

    private int year, isLeap;

    public Leap()
    {

    }
    public Leap(int yr)
    {
        year = yr;
    }

    public void check() 
    {
        if (year % 4 == 0) 
        {
            if (year % 100 == 0) 
            {
                if (year % 400 == 0) 
                {
                    isLeap = 1;
                } 
                else 
                {
                    isLeap = 0;
                }
            } 
            else 
            {
                isLeap = 1;
            }
        }
    }

    public void putData() 
    {
        if (isLeap == 1) 
        {
            System.out.println(year + " is a leap year.");
        } 
        else 
        {
            System.out.println(year + " is not a leap year.");
        }
    }

}

public class LeapYear 
{
    public static void main(String args[]) 
    {
        int year;
        System.out.println("Enter year: ");
        Scanner s = new Scanner(System.in);
        year = s.nextInt();
        Leap x = new Leap(year);
        x.check();
        x.putData();
        s.close();
    }

}