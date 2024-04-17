package JavaPractise;

public class findAllSubstrings {

	public static void main(String[] args) {

     String str = "ADARSH";
     int k=0;
     
     for(int i=0;i<str.length();i++)
      for(int j=i+1;j<=str.length();j++)
    	  
      {
    	  System.out.print(str.substring(i, j)+",");
    	  k++;
      }

     
     System.out.print("Total no. of Substrings are "+k);
	}

}
