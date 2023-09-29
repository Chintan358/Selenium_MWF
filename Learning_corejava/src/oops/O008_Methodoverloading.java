package oops;

class Sample
{
	public void getData()
	{
		System.out.println("Blank method called");
	}
	
	public void getData(String name)
	{
		System.out.println(name);
	}
	
	public void getData(int id)
	{
		System.out.println(id);
	}
	
	public void getData(int id,String name)
	{
		System.out.println(id+" "+name);
	}
}

public class O008_Methodoverloading {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.getData(10,"nirav");
		s.getData();
		s.getData(10);
		
		
		
	}
}
