package array;

public class A002_ArrayOpration {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,40,500,60,5,70,50};
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
//		System.out.println("sum  : "+sum);
//		System.out.println("avg : "+(sum/a.length));
		
		int max = a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("min : "+min);
	}
}
