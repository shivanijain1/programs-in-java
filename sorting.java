import java.util.Scanner;
public class sorting
{
    public static void main(String[] args) 
    {
        int n, temp;
        int f=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i=0; i < n-1; i++) {
        	for(int j=i+1; j < n; j++)
        	{
        		if (a[i]==a[j]) {
        			f++;
        		System.out.println(a[i]);
        		}
        		}
        	}
    System.out.println(+f );    }
    
        	
    }
