class Student2
{
	int rollno;
	String name;
	static String college = "TSEC";
	Student2(int r, String n)
	{
		rollno = r;
		name = n;
	}
	void display() 
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class TestStaticVariable
{
	public static void main(String args[]) 
	{
		Student2 s1 = new Student2(1,"John");
        Student2 s2 = new Student2(2, "Patrick");
        s1.college = "VJTI";
        s2.college = "SPIT";
		s1.display();
        s2.display();
	}
}