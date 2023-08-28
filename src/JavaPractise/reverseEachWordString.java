package JavaPractise;

public class reverseEachWordString {

	public static void main(String[] args) {
		
		String str= "Selenium WebDriver is Automation Tool";
		String words[] = str.split("\\s");
	    String reversedString = "";
	 
	    for (int i=0;i<words.length;i++)
	    {   
	        String word = words[i];
	        String reverseword ="";
	    	for(int j=word.length()-1;j>=0;j--)
	    		
	    	{
	    		reverseword = reverseword+ word.charAt(j);
	    	}
	    	reversedString = reversedString + reverseword+" ";
	    	
	    	System.out.println(reversedString);
		
	}
	}

}
