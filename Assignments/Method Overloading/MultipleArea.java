import java.util.Scanner;

class Area
{
    private int  areaSq;
    private double areaRec, areaCir, areaTri;
    int calculateArea(int side) //Area of square
    {
        areaSq = side*side;
        return(areaSq);
    }
    double calculateArea(double radius) //Area of circle
    {
        areaCir = 3.142 * radius * radius;
        return(areaCir);
    }
    double calculateArea(double side1, double side2) //Area of rectangle
    {
        areaRec = side1 * side2;
        return(areaRec);
    }
    double calculateArea(double side1, double side2,  double side3) //Area of triangle
    {
        areaTri = side1 * side2 * side3;
        return(areaTri);
    }
    static int menu()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\n   ----------------MENU----------------");
        System.out.println("   1] Area of square");
        System.out.println("   2] Area of circle");
        System.out.println("   3] Area of rectangle");
        System.out.println("   4] Area of triangle");
        System.out.println("   5] Exit");
        System.out.print("   Choice: ");
        choice = sc.nextInt();
        return choice;
    }


}

public class MultipleArea
{
	public static void main(String args[])
	{
        int choice, side;
        Scanner sc = new Scanner(System.in);
        Area A = new Area();
        double side1, side2, side3, radius;
        do
        {
            choice = Area.menu();
            if(choice == 1)
            {
                System.out.println("   Square.");
                System.out.print("   Enter Side: ");
                side = sc.nextInt();
                System.out.println("   Area of Square: "  + A.calculateArea(side));
            }
            else if(choice == 2)
            {
                System.out.println("   Circle.");
                System.out.print("   Enter Radius: ");
                radius = sc.nextDouble();
                System.out.println("  Area of Circle: "  + A.calculateArea(radius));
            }
            else if(choice == 3)
            {
                System.out.println("   Rectangle.");
                System.out.print("   Enter Side1: ");
                side1 = sc.nextDouble();
                System.out.print("   Enter Side2: ");
                side2 = sc.nextDouble();
                System.out.println("   Area of Rectangle: "  + A.calculateArea(side1, side2));
                
            }
            else if(choice == 4)
            {
                System.out.println("   Triangle");
                System.out.print("   Enter Side1: ");
                side1 = sc.nextDouble();
                System.out.print("   Enter Side2: ");
                side2 = sc.nextDouble();
                System.out.print("   Enter Side3: ");
                side3 = sc.nextDouble();
                System.out.println("   Area of Triangle: "  + A.calculateArea(side1, side2, side3));
            }
            else if(choice == 5)
            {
                System.out.println("   Exiting...");
                System.exit(0);
            } 
        }
        while (choice != 5);
        
        
	}

}