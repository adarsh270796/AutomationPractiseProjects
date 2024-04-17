package JavaPractise;

public class fabonacciSeries {

	public static void main(String[] args) {


		int a=0; int b=0; int c=1;
		int num=12;
		for(int i=0;i<num;i++)
		{
		a=b;
		b=c;
		c=a+b;
		
		System.out.print(a + " ");
		}
	}

}
