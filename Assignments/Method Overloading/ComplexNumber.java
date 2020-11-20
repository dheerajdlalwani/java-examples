import java.util.Scanner;

class Complex
{
    private double x, iy;

    public Complex()
    {

    }

    public Complex(double x, double iy)
    {
        this.x = x;
        this.iy = iy;
    }

    public double getReal()
    {
        return x;
    }

    public double getImaginary()
    {
        return iy;
    }

    public static Complex add(Complex x1, Complex x2)
    {
        Complex z = new Complex();
        z.x = x1.x + x2.x;
        z.iy = x1.iy + x2.iy;
        return z;
    }

    
}


public class ComplexNumber
{
    
	public static void main(String args[])
	{ 

        double x1Real , x1Imaginary , x2Real , x2Imaginary , answerReal , answerImaginary;
        Complex answer;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter real part of 1st number: ");
        x1Real = s1.nextDouble();
        System.out.print("Enter imaginary part of 1st number: ");
        x1Imaginary = s1.nextDouble();
        System.out.print("Enter real part of 2nd number: ");
        x2Real = s1.nextDouble();
        System.out.print("Enter imaginary part of 2nd number: ");
        x2Imaginary = s1.nextDouble();
        Complex x1 = new Complex(x1Real, x1Imaginary);
        Complex x2 = new Complex(x2Real, x2Imaginary);

        answer = Complex.add(x1, x2);
        answerReal = answer.getReal();
        answerImaginary = answer.getImaginary();
        System.out.println("Addition: ");
        System.out.println("Real part of Answer: " + answerReal);
        System.out.println("Imaginary part of Answer: " + answerImaginary);
            
	}

}