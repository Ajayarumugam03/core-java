package aug13;

public class instand {
	private int id;
	private String name;
	public void student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instand ob=new instand();
		ob.student(07, "Ajaykumar");
		ob.display();
	}

}

