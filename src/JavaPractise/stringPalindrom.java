package JavaPractise;

public class stringPalindrom {

	public static void main(String[] args) {

       String abc = "Mississim";
       String newabc = abc.toLowerCase();
       System.out.println(newabc.length());
       
       if(isPalindrome(newabc))
       {
    	   System.out.println(newabc+" String is Palindrome");
       }
       else
    	   System.out.println(newabc+" String is not Palindrome");
	}

	public static boolean isPalindrome(String newabc) {
		int left =0; int right = newabc.length()-1;
		while(left<right)
		{
			if(newabc.charAt(left)!=newabc.charAt(right))
			{
				return false;
		
			}
			
			left++;
			right--;
			
		}
		return true;
		
		
	}

}
