package statements;

public class S_IF_ELSe {
	public static void main(String[] args) {
		
		
		int a =450;
		int b = 300;
		int c = 400;
		
//		if(a>b)
//		{
//			if(a>c) {
//				System.out.println("a is greater");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//			
//		}
//		else
//		{
//			if(b>c) {
//			System.out.println("b is greater");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//		}
//		
		
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
		
		
	}
}
