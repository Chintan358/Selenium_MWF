package oops;

class Emp
{
	int id;
	String name;
	double sal;
	
	Emp()
	{
		System.out.println("Constructor calling...");
	}
	Emp(String name)
	{
		System.out.println("Name is : "+name);
	}
	
	Emp(int id)
	{
		System.out.println("id is : "+id);
	}
	
	Emp(int a, String b, double c)
	{
		id = a;
		name=b;
		sal = c;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+sal);
	}
}

public class O003_constructorDemo {
	public static void main(String[] args) {
		
//		Emp e = new Emp();
//		Emp e1 = new Emp("Tops");
//		Emp e2 = new Emp(10);
		
		Emp emp = new Emp(10,"Tops",23.66);
		emp.display();
		
		Emp emp1 = new Emp(20,"tech",456.66);
		emp1.display();
		
		
	}
}
