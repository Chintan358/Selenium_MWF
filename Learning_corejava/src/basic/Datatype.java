package basic;

public class Datatype {
	public static void main(String[] args) {
		
		//widning - implicite
		int a = 10;  //4 byte
		long b = a;  //8 byte
		
		//nerrowing - explicite
		long i = 32869; //8 byte
		int j = (int) i;    //4 byte
		//System.out.println(j);
		
		
		int k = '(';
		System.out.println(k);
		
		char c = 40;
		System.out.println(c);
		
	}
}
