package array;

public class A004_MdArray {
	public static void main(String[] args) {
		
		int a[][] = {{10,20,30,22},{20,40,80,90},{20,30,60,40,},{10,20,30,10},{20,30,40,50}};
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
		
	}
}
