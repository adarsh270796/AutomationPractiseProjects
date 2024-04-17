package JavaPractise;

public class palindromNumber {

	public static void main(String[] args) {
		
		int num = 2345432;
		int rem, rev=0;
		int orignalNum = num;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
        if(orignalNum==rev)
        {
        	System.out.println("Number is Palindronm");
        }
        else
        	System.out.println("Number is not Palindronm");	
	}

}
