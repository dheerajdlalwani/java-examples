import java.util.Scanner;

class Employee
{
    private int id;
    private String name;
    private double salary;

    public Employee()
    {

    }

    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

}


class SortEmployee
{
    public Employee [] sortAscendingSalary(Employee x [])
    {
        int pos, cpos;
        Employee temp1;
        for(pos = 0; pos <= (x.length)-2; pos++)
        {
            for(cpos = pos + 1; cpos <= (x.length)-1; cpos++)
            {
                if(x[pos].getSalary() > x[cpos].getSalary())
                {
                    temp1 = x[pos];
                    x[pos] = x[cpos];
                    x[cpos] = temp1;
                }
            }
        }

        return x;
    }

    public Employee [] sortDescendingSalary(Employee y [])
    {
        int pos, cpos;
        Employee temp2;
        for(pos = 0; pos <= (y.length)-2; pos++)
        {
            for(cpos = pos + 1; cpos <= (y.length)-1; cpos++)
            {
                if(y[pos].getSalary() < y[cpos].getSalary())
                {
                    temp2 = y[pos];
                    y[pos] = y[cpos];
                    y[cpos] = temp2;
                }
            }
        }

        return y;
    }
}


public class EmployeeArray {
    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("  Please Enter the number of employees: ");
        int n = s.nextInt();

        Employee employeeList [] = new Employee [n];

        
        Employee salarySortedEmployeeListAscending [] = new Employee [n];
        Employee salarySortedEmployeeListDescending [] = new Employee [n];

        System.out.println("  Please enter the following details: ");

        for(int i = 0; i < employeeList.length; i++)
        {
            System.out.println("  Employee: " + i);
            System.out.print("  id: ");
            int id = s.nextInt();
            s.nextLine();
            System.out.print("  Name: ");
            String name = s.nextLine();
            System.out.print("  Salary: ");
            double salary = s.nextDouble();
            employeeList[i] = new Employee(id, name, salary);
            System.out.println("\n");
        }

        SortEmployee SE1 = new SortEmployee();
        SortEmployee SE2 = new SortEmployee();
        
        

        salarySortedEmployeeListAscending = SE1.sortAscendingSalary(employeeList);
        
        System.out.println("  Printing details of Employees sorted in Ascending order of their Salaries: ");

        for(int i = 0; i < salarySortedEmployeeListAscending.length; i++)
        {
            System.out.println("  Employee id: " + salarySortedEmployeeListAscending[i].getId());
            System.out.println("  Employee Name: " + salarySortedEmployeeListAscending[i].getName());
            System.out.println("  Employee Salary: " + salarySortedEmployeeListAscending[i].getSalary());
            System.out.println("  ===================================================");
        }

        System.out.println("\n");

        
        salarySortedEmployeeListDescending = SE2.sortDescendingSalary(employeeList);

        System.out.println("  Printing details of Employees sorted in Descending order of their Salaries: ");

        for(int j = 0; j < salarySortedEmployeeListDescending.length; j++)
        {
            System.out.println("  Employee id: " + salarySortedEmployeeListDescending[j].getId());
            System.out.println("  Employee Name: " + salarySortedEmployeeListDescending[j].getName());
            System.out.println("  Employee Salary: " + salarySortedEmployeeListDescending[j].getSalary());
            System.out.println("  ===================================================");
        }

        System.out.println("\n");

        s.close();

    }    
}
