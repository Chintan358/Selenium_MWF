package array;

public class A003_MDArray {
	public static void main(String[] args) {
		
		
		int a[][] = new int[3][5];		
		
		a[0][0] = 45;
		a[0][1] = 48;
		a[0][2] = 41;
		a[0][3] = 39;
		a[0][4] = 35;
		
		a[1][0] = 40;
		a[1][1] = 48;
		a[1][2] = 41;
		a[1][3] = 39;
		a[1][4] = 38;
		
		a[2][0] = 45;
		a[2][1] = 47;
		a[2][2] = 41;
		a[2][3] = 37;
		a[2][4] = 35;
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
