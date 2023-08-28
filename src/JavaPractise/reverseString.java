package JavaPractise;

public class reverseString {

	public static void main(String[] args) {
		
		//reverse the string //string is immutable so we can not use reverse function for this
		//stringbuffer is mutable so we can use reverse function
		
		//Using StringBuffer to reverse each word in the sprint
//		String str = "Hello World";
//		StringBuffer sb = new StringBuffer(str);
//		
//		System.out.print(sb.reverse());
		
		//Using the loop
		String str  =  "This string is being Reveresed";
	    String reversedString ="";
        char character;
        for(int i=0;i<str.length();i++){
        //extracts each character
        character= str.charAt(i);
        //concatenates each character in front of the new string   i.e. reversedString
        reversedString = character+reversedString;
 }

	   System.out.println("Reversed string: "+reversedString); //  Printing the reversed String
}
}
