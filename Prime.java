package guvi;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int f=1;
		for(int i=2;i<n;i++)
		{ 
			if(n%i==0)
			{
				f=0;
				break;
			}
			else
			{
				f=1;
			}
			}
		if(f==1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
