package JavaPractise;

public class Swaptwonumbers {

	public static void main(String[] args) {
		int a=13;
		int b=23;
		
	//	using third variable
	/*	int z;
		z=a;
		a=b;
		b=z;
		System.out.println("a= "+a+" b= "+b);
	*/	
   //without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+" b= "+b);

	}

}
