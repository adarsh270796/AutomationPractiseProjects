package JavaPractise;

public class armstrongNmber {

	public static void main(String[] args) {
		
		int num = 153;
		int rem, result=0;
		int OrignalNum = num;
		
		
		while(OrignalNum!=0)
		{
			rem=OrignalNum%10;
			result = result + rem*rem*rem;
			OrignalNum = OrignalNum/10;
			
		}
        if(OrignalNum==num)
        {
        	System.out.println("Number is Armstrong ");
        }
        else
        	System.out.println("Number is not Armstrong ");	
	}

}
