package shivanijain;
import java.util.Scanner;

public class binarytodecimal {
	public static void main (String []args)
	{
		int rev=0;
		int n;
	
	System.out.println("enter an integer to be prime");
	Scanner in=new Scanner (System.in);
	n = in.nextInt();
while (n!=0)
	{
	int r = n%2;
rev	= rev*10+r;
	n =n/2;
	}		
System.out.println(rev);
	
}
	}