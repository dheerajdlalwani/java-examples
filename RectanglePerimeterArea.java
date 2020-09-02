import java.util.*;

import org.w3c.dom.css.Rect;

class Rectangle
{
    private double length, breadth, perimeter, area;
    public Rectangle()
    {
        length = breadth = 0.0;
    }
    public Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }
    public Rectangle(double side)
    {
        length = breadth = side;
    }

    void calculatePerimeter()
    {
        perimeter = 2 * length + 2 * breadth;
    }
    void calculateArea()
    {
        area = length * breadth;
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

public class RectanglePerimeterArea {
    public static void main(String [] Args)
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.5);
        Rectangle r3 = new Rectangle(5.5, 7.3);

        r1.calculatePerimeter();
        r1.calculateArea();
        System.out.println("r1:\nPerimeter: " + r1.getPerimeter() + "\nArea: " + r1.getArea() + "\n");
        r2.calculatePerimeter();
        r2.calculateArea();
        System.out.println("r2:\nPerimeter: " + r2.getPerimeter() + "\nArea: " + r2.getArea() + "\n");
        r3.calculatePerimeter();
        r3.calculateArea();
        System.out.println("r3:\nPerimeter: " + r3.getPerimeter() + "\nArea: " + r3.getArea() + "\n");
    }
}
