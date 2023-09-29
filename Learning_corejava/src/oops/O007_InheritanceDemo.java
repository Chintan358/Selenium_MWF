package oops;

class A
{
	int id = 10;
	String name = "test";
	
	public void display()
	{
		System.out.println("Runing class a display");
		System.out.println(id+" "+name);
	}
}

class B extends A
{
	String phno="8969857485";
	int id = 50;
	public void show()
	{
		
		System.out.println("Runing class B show");
		System.out.println(super.id+" "+name+" "+phno);
		System.out.println(id+" "+name+" "+phno);
	}
}

class C extends B
{
	
}
public class O007_InheritanceDemo {
	public static void main(String[] args) {
		
		B b  =new B();
		b.show();
	}
}
