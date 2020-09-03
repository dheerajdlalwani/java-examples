
// 1 class method
import java.util.Scanner;

public class SimpleInterest1 {
	public static void main(String args[]) {
		double p, t, r, si;
		// Input p, t, r
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter p, t, r");
		p = s.nextDouble();
		t = s.nextDouble();
		r = s.nextDouble();

		// Calculate Simple Interest
		si = (p * t * r) / 100;

		// Display Simple Interest
		System.out.println("Simple Interest = " + si);
		s.close();
	}
}