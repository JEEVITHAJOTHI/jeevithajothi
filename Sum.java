package guvi1;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=0;
		for(int i=a;i<=b;i++)
		{
			c=c+i;
		}

		System.out.println(c);
	}

}
