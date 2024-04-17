package JavaPractise;

public class practiseSpace {

	public static void main(String[] args) {

     String a = "Adarsh is";
     String rev = "";
     
     for(int i=0;i<a.length();i++)
     {
    	 char ch= a.charAt(i);
    	 rev=ch+rev;
     }
       System.out.println(rev);
	}

}


