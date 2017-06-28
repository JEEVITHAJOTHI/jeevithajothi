package guvi;
import java.util.Scanner;
public class Sumofnn 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int m=0;
		int x=s.nextInt();
		for(int i=1;i<=x;i++)
		{
			m=m+i;
		}
		System.out.println("The sum of "+x+" numbers is "+m);
		
	}

}