package JavaPractise;

public class reversetheInteger {

	public static void main(String[] args) {
		// 1. using the algo
		int num = 123458766;
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num=num/10;
		}
      System.out.println(rev);
      
      
      //2. Using the string Buffer
      int num2 = 34567;
      System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
     
	}

}
