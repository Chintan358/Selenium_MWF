package oops;


class Student
{
	int id;
	String name;
	String email;
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
}

public class O002_ObjectDemo {
	public static void main(String[] args)
	{
		Student st = new Student();
		st.display();
	}
}


