package JavaPractise;

public class RemoveSpecialCHaracter {

	public static void main(String[] args) 
	{
		String s = "&^%&%^%Ada&&&rsh123";
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	     String s1= "&^%&%^%Ada&&&rsh123";
	     s1=s1.replace("&", "Hi");
		System.out.println(s1);
	}

}
