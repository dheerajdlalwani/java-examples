// 2 class method (get data, put data)

import java.util.Scanner;

class Interest {
    private double p, t, r, si;

    public Interest()
    {

    }
    public Interest(double a, double b, double c)
    {
        p = a;
        t = b;
        r = c;
    }

    public void calculation() {
        si = (p * t * r) / 100;
    }

    public double getSI() {
        return si;
    }

}

public class SimpleInterest2 {
    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter p, t & r");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();
        Interest X = new Interest(x, y, z);
        X.calculation();
        double output = X. getSI();
        System.out.println("Simple interest = " + output);

    }
}