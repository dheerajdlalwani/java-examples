import java.util.*;


public class StudentMarks {
    public static void main(String[] args) {
        int marks [] = new int[args.length];
        for(int i = 0; i < args.length; i++)
        {
            marks[i] = Integer.parseInt(args[i]);
        }

        System.out.println("  The marks are: ");

        for(int i = 0; i < args.length; i++)
        {
            System.out.println("  marks[" + i + "] = " + marks[i]);
        }

        int largest = marks[0];
        int total = 0; 
        for(int i = 0; i < args.length; i++)
        {
            if(marks[i] > largest)
            {
                largest = marks[i];
            }
            total += marks[i];
        }

        System.out.println("  Highest marks: " + largest);
        System.out.println("  Total marks: " + total);
    }
}
