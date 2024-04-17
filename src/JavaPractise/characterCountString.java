package JavaPractise;

public class characterCountString {

	public static void main(String[] args) {
		
		String abc= "Testing";
		int count = 0;
		
		for(int i=0;i<abc.length();i++) {
			if(abc.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
