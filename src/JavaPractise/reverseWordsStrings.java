package JavaPractise;

public class reverseWordsStrings {

	public static void main(String[] args) {
		
		
		String str= "Selenium WebDriver is Automation Tool";
		String words[] = str.split("\\s");
	    String reversedString = "";
	 
	    for (int i=0;i<words.length;i++)
	    {   if(i==words.length-1)
	    {    reversedString =  words[i] + reversedString; 
	    	
	    }   else
	    	reversedString = " "+words[i]+reversedString;
	    }
	    // Displaying the string after reverse
	    System.out.print("Reversed string : " + reversedString);
		
		
	}

}
