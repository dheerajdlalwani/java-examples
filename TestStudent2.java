class Student1
{
	int id;
	String name;
	void insertRecord(int i,String n)
	{
		id=i;
		name=n;
	}
	void displayInformation()
	{
		System.out.println(id+" "+name);
	}
}
public class TestStudent2
{
	public static void main(String args[])
	{
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		s1.insertRecord(101,"abc");
		s2.insertRecord(102,"xyz");
		s1.displayInformation();
		s2.displayInformation();
	}
}