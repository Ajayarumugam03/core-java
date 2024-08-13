package aug13;

public class st {
	int id;
	String name;
	static String college="APSAC";
	st(int a, String b)
	{
		id=a;
		name=b;
	}
	void display()
	{
		System.out.println("Student_Id : "+id);
		System.out.println("Student_Name : "+name);
		System.out.println("Student_College : "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		st obj=new st(7, "ajaykumar");
		st ob=new st(8, "akilan");
		obj.display();
		ob.display();
	}

}