package JavaPractise;

public class findMissingNumberInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,9};
		
		//1. using for loops
	/*    int sum=0;
	    int sum1=0;
		
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		  
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
		}
		System.out.println(sum1);
        System.out.println(sum1-sum); 
	*/	
		//2. using the mathemetical formula
		int n = a.length+1;
		int sumOfAll = n*(n+1)/2;
		int sumOfArr=0;
	//	System.out.println(sumOfAll);
		for (int i=0;i<a.length;i++)
		{
			sumOfArr=sumOfArr+a[i];
		}
	//	System.out.println(sumOfArr);
		System.out.println("missing number is "+(sumOfAll-sumOfArr));
	}


	
	
}
