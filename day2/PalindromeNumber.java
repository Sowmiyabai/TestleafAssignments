package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		 int input = 121, output = 0, rem;
		  

		    for (int i = input; i > 0; i = i / 10) {
		    	// what will be the value of i in first iteration 121 0r 12?
		        rem = i % 10;
		        output = (output * 10) + rem;
		    }
		    
		    System.out.println("Reversed Number is "+output);

		    if (output == input)
		    {
				System.out.println("The given number is palindrome");	
			}
			else {
				System.out.println("The given number is not palindrome");	
			}
	
		
		
		
				

	}

}
