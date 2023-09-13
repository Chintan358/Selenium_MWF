package statements;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("value of a : ");
		int a = sc.nextInt();
		System.out.println(" b : ");
		int b = sc.nextInt();
		System.out.println("name : ");
		String name = sc.next();
		double d = sc.nextDouble();
		System.out.println(a+b+name+d);
		sc.close();
	}
}
