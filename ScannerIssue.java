import java.util.*;

public class ScannerIssue 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flight number1: ");
        int flightNumber1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter departing city:");
        String departingCity = scanner.nextLine();
        System.out.println("Enter arrival city: ");
        String arrivalCity = scanner.nextLine();
	    System.out.println("Flight number1:" +flightNumber1);
	    System.out.println("Departure:" +departingCity);
        System.out.println("Arrial:" +arrivalCity);
        scanner.close();
    }
}