class Student4
{
	int rollno;
	String name;
	static String college = "TSEC";
	Student4(int r, String n)
	{
		rollno = r;
		name = n;
	}
	static void change(){
		college="Thadomal Shahani Engineering College";
	}

	void display() 
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
class TestStaticVariableMethod
{
	public static void main(String args[]) 
	{
		Student4.change();
		Student4 s1 = new Student4(1,"John");
		Student4 s2 = new Student4(2, "Patrick");
		s1.display();
		s2.display();
	}
}