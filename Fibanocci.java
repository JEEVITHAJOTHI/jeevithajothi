package guvi1;
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		int t=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++)
		{
			t=a+b;
			a=b;
			b=t;
			System.out.println(t);
			
		
		}
		

	}

}
