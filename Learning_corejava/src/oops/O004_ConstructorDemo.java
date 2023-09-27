package oops;

class Product
{
	int id;
	int price;
	String name;
	int qty;
	String company;
	
	


	public Product(int id, int price, String name, int qty, String company) {
		
		this.id = id;
		this.price = price;
		this.name = name;
		this.qty = qty;
		this.company = company;
	}




	public void display()
	{
		System.out.println(price+" "+name);
	}
}


public class O004_ConstructorDemo
{
	public static void main(String[] args)
	{
		Product p = new Product(1,50,"Pen",5,"cello");
		p.display();
		
		Product p1 = new Product(2, 10, "Fan", 10, "usha");
		p1.display();
		
		
		
		
		
	}
}
