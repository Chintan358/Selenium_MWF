package oops;

class Pen
{
	static int price = 10;
	String company="Cello";
	String color = "Red";
	
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
}

public class O001_FirstDemo {
	public static void main(String[] args) {
		
		Pen.price=80;
		
		Pen p = new Pen();
		
		p.color="Black";
		p.toWrite();
		
		Pen p1 = new Pen();
		p1.color="white";
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.toWrite();
		
		
	}
}
