package statements;

import java.util.Scanner;

public class S003_Calc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value of a : ");
		 int a =sc.nextInt() ;
		 System.out.println("Enter value of b : ");
		 int b = sc.nextInt();
		 System.out.println("enter choice : ");
		 int choice = sc.nextInt();
		 
		 if(choice == 1)
		 {
			 System.out.println(a+b);
		 }
		 else if(choice==2)
		 {
			 System.out.println(a-b);
		 }
		 else if(choice==3)
		 {
			 System.out.println(a*b);
		 }
		 else if(choice==4)
		 {
			 System.out.println(a/b);
		 }
		 else
		 {
			 System.out.println("Invalid choice");
		 }
		
		
	}
}
