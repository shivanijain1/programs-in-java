import java.util.Scanner;

public class prime {

	public static void main (String[] args)
	
	{
		int n=0;
System.out.println("enter an integer to be prime");
Scanner in=new Scanner (System.in);
n = in.nextInt();

		int c=0;
			
				for (int i=2;i<n;i++)
		{
		if(n%i==0)	
		{	c++;
		
		if(c>=1) 
		
			System.out.println("number is not prime");
		else
			System.out.println("number is prime");
			}	
					
		}
		
		}
		
	}