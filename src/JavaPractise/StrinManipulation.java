package JavaPractise;

public class StrinManipulation {

	public static void main(String[] args) {
		String s= "Today is Friday!!";
		String s1= "Today is Friday!!";
		
		System.out.println(s.charAt(9));
		System.out.println(s.length());
		System.out.println(s.indexOf("y"));
		System.out.println(s.indexOf('y', s.indexOf('y')+1));
		System.out.println(s.indexOf("is"));
		
		//string comparision
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		//substring
		System.out.println(s.substring(14));
		System.out.println(s.substring(3, 10));
		
		//trim
		String s2= "    Hi Adarsh   ";
		System.out.println(s2.trim());
		
		//replace
		System.out.println(s2.replace(" ", ""));
		
		String date = "22-03-2025";
		System.out.println(date.replace("-", "/"));
		
		//split
		String s4 = "My name is Khan";
		String news4[]=s4.split(" ");
		for(int i=0; i<news4.length;i++)
		{
			System.out.println(news4[i]);
		}
		
		//concat
		String s5= "Hello";
		System.out.println(s5.concat("bhg"));
		
		

	}

}
