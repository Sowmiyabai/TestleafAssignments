package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int n = 10;
		
		for(int i=2; i<n-1; i++)
		{
			if(i%2<1)
			{
			System.out.println("The given number is not a prime number" +i);
			}
			else
			{
			System.out.println("The given number is a prime number" +i);
			}
		}
		}

	}


