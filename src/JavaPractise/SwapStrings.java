package JavaPractise;

public class SwapStrings {

	public static void main(String[] args) {
		
		
		String s1="Sun";
		String s2= "Moon";
		s1=s1+s2;
		s2=s1.replace(s2,"");
		s1=s1.replace(s2, "");
		System.out.println("Swapped Strings are: "+s1+" and "+s2);
	}

}
