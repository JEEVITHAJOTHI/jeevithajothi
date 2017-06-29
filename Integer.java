package guvi;
import java.util.Scanner;
public class Integer {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=0;
		if(a<0)
		{
			a=a*-1;
			
		}
		if(a==0)
		{
			a=1;
		}
		while(a>0)
		{
			a=a/10;
			b++;
		}
		System.out.println("the number of digit in "+a+" is "+b);

	}

}
