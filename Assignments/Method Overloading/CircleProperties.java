class Circle
{
    private double radius, perimeter, area, centerX, centerY;
    public Circle()
    {
        centerX = 5;
        centerY = 5;
        radius = 7.75;
    }

    void calculatePerimeter()
    {
        perimeter = 2 * 3.142 * radius;
    }
    void calculateArea()
    {
        area = 3.142 * radius * radius;
    }
    double getPerimeter()
    {
        return perimeter;
    }
    double getArea()
    {
        return area;
    }

}

public class CircleProperties 
{
    public static void main(String [] Args)
    {
        Circle c1 = new Circle();
        c1.calculatePerimeter();
        c1.calculateArea();
        System.out.println("Perimeter: " + c1.getPerimeter() + "\nArea: " + c1.getArea() + "\n");
    }
}
