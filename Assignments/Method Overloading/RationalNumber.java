import java.io.*;
import java.util.*;

class Rational
{
    private float numerator, denominator;
    Rational(float n, float d)
    {
        numerator = n;
        denominator = d;
    }

    void displayRational(Rational r)
    {
        System.out.println(r.numerator + " / " + r.denominator);
    }

    void addRational(Rational r1, Rational r2)
    {
        float answerN, answerD;
        if(r1.denominator != r2.denominator) {
            answerN = r1.denominator * r2.numerator + r2.denominator * r1.numerator;
            answerD = r1.denominator * r2.denominator;
        }
        else {
            answerN = r1.numerator + r2.numerator;
            answerD = r1.denominator;
        }

        Rational answer = new Rational(answerN, answerD);
        System.out.print("\n\nThe addition of  ");
        displayRational(r1);
        System.out.print("  +  ");
        displayRational(r2);
        System.out.print("   is   ");
        displayRational(answer);
    }
    void subtractRational(Rational R1, Rational R2)
    {
        float answerN, answerD;
        if(R1.denominator != R2.denominator) {
            answerN = R2.denominator * R1.numerator - R1.denominator * R2.numerator ;
            answerD = R1.denominator * R2.denominator;
        }
        else {
            answerN = R1.numerator - R2.numerator;
            answerD = R1.denominator;
        }

        Rational ans = new Rational(answerN, answerD);
        System.out.print("\n\nThe subtraction of  ");
        displayRational(R1);
        System.out.print("  -  ");
        displayRational(R2);
        System.out.print("   is   ");
        displayRational(ans);
    }
    void multiplyRational(Rational R1, Rational R2)
    {
        float answerN, answerD;

        answerN = R2.numerator * R1.numerator;
        answerD = R1.denominator * R2.denominator;

        Rational ans = new Rational(answerN, answerD);
        System.out.print("\n\nThe multiplication of  ");
        displayRational(R1);
        System.out.print("  *  ");
        displayRational(R2);
        System.out.print("   is   ");
        displayRational(ans);
    }
    void divideRational(Rational R1, Rational R2)
    {
        float answerN, answerD;

        answerN = R2.denominator * R1.numerator;
        answerD = R1.denominator * R2.numerator;

        Rational ans = new Rational(answerN, answerD);
        System.out.print("\n\nThe division of  ");
        displayRational(R1);
        System.out.print("  /  ");
        displayRational(R2);
        System.out.print("   is   ");
        displayRational(ans);
    }
}

class RationalNumber {
    public static void main(String ar[])throws IOException
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the first rational number a / b");
        System.out.print("\nEnter a:  ");
        int a = s.nextInt();
        System.out.print("Enter b:  ");
        int b = s.nextInt();
        
        Rational r1 = new Rational(a, b);
        System.out.print("\nThe rational number entered is ");
        r1.displayRational(r1);
        
        System.out.println("\n\nEnter the second rational number c / d");
        System.out.print("\nEnter c:  ");
        a = s.nextInt();
        
        System.out.print("Enter d:  ");
        b = s.nextInt();
        Rational r2 = new Rational(a, b);
        System.out.print("\nThe rational number entered is:  ");
        r2.displayRational(r2);
        System.out.println();

        r1.addRational(r1, r2);
        r1.subtractRational(r1, r2);
        r1.multiplyRational(r1, r2);
        r1.divideRational(r1, r2);
        System.out.println();
    }
}