package JavaPractise;

public class pattern {

	public static void main(String[] args) {
		
		int a=0, b=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				if(j%2==0) {
					System.out.print(b+" ");
				}
				else
					System.out.print(a+" ");
				
			}
			
			System.out.println();
		}
	}

}
