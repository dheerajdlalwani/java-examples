// 2 class method (get data, put data)

import java.util.Scanner;

class Interest {
    private double p, t, r, si;

    public void getData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter p, t & r");
        p = s.nextDouble();
        t = s.nextDouble();
        r = s.nextDouble();
    }

    public void calculation() {
        si = (p * t * r) / 100;
    }

    public void putData() {
        System.out.println("Simple interest: " + si);
    }

}

public class SimpleInterest2 {
    public static void main(String args[]) {
        Interest X = new Interest();
        X.getData();
        X.calculation();
        X.putData();

    }
}