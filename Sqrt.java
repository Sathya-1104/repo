
public class Sqrt {
	public static void main(String [] args) {
		int a=25;
		double b;
		double sqrt=a/2;
		double sq=a*a;
		do 
		{
			b=sqrt;
			sqrt=(b+(a/ b))/2;
			
		}
		while ((b-sqrt)!=0);
		System.out.println("the square root of " + a + "is:" + sqrt);
		System.out.println("the square of" + "is:" + sq);
      
	}

}
