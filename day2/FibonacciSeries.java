package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstTerm = 0;
		int secondTerm = 1;
		
		System.out.println("The fibonacci series values are");
		
		
		for(int i=1; i<=8; i++)
		{
			
			System.out.println(firstTerm);
			
			 int nextTerm = firstTerm + secondTerm;
			 
			 firstTerm = secondTerm;
			 secondTerm = nextTerm;
		}
		

	}

}
