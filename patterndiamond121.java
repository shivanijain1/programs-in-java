import java.util.Scanner;

public class patterndiamond121
{
public static void main(String[] args)

{
	int n;
	System.out.println("enter the number");
	Scanner in =new Scanner(System.in);
	n =in.nextInt();
	int s = n-1;
	int l = 1;
	
	
		
	for (int i=1; i<=n; i++)
	{
		int k=0;
	for (int j=1; j<=s; j++)
	{
	System.out.print(" ");
	}
	for (int j=1; j<=l; j++)
	{
		if(j<=i)
		{
			k = k+1;
		}
			else
			{
				k = k-1;
			}
			
			System.out.print(k);
	}
			l=l+2;
			s=s-1;
			System.out.println(" ");
			
			}
		}
		
	}
		
	




