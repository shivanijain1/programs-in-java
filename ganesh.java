package shivanijain;
import java.util.Scanner;
public class ganesh {
public static void main(String []args)
{int n=0;
System.out.println("enter an integer to be prime");
Scanner in=new Scanner (System.in);
n = in.nextInt();
	for (int i=1; i<=n; i++)
	{
		for (int j=1; j<=n; j++)
		{
			if (j==1&&i<(n+1)/2||i==(n+1)/2&&j<(n+1)/2||j==(n+1)/2&&i<=n||i==1&&j>(n+1)/2||i==(n+1)/2&&j>(n+1)/2||j==n&&i>=(n+1)/2||i==n&&j<(n+1)/2)
			
				System.out.print("*");
				
			else 
				System.out.print(" ");
			
			
			
		}
System.out.println( );
}
}
}
