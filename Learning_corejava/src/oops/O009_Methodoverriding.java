package oops;

class P
{
	public void print()
	{
		System.out.println("runinng P class method");
	}
}

class Q extends P
{
	public void print()
	{
		System.out.println("runinng Q class method");
		
	}
}

public class O009_Methodoverriding {
	public static void main(String[] args) {
		
		Q q = new Q();
		q.print();
		
	}
}
