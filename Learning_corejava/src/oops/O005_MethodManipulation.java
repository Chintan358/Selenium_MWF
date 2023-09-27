package oops;

class Calc
{
	public void print()
	{
		System.out.println("Runing print method");
	}
	
	public void square(int a)
	{
		int sq  =a*a;
		System.out.println("Square is : "+sq);
	}
	
	public void add(int a, int b)
	{
		int result  =a+b;
		System.out.println("Addition is : "+result);
	}
	
	public int cube(int a)
	{
		int cube = a*a*a;
		return cube;
	}
	
	public String getName()
	{
		String name = "Nirav";
		return name;
	}
	
	public void addArray(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
}

public class O005_MethodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.print();
		c.square(10);
		c.add(20, 30);
		
		int abc = c.cube(10);
		
		
		
//		String str =  c.getName();
//		System.out.println(str);
		System.out.println(c.getName());
		
		
		int a[] = {10,20,30,40,50,60};
		int b[] = {50,60,90};
		c.addArray(a);
		c.addArray(b);
		
	}
}
