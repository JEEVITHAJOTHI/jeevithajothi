package guvi1;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=0;
		int r=0;
		while(a>0)
		{
			b=a%10;
			r=r*10+b;
			a=a/10;
			
		}
		System.out.println(r);
		

	}

}
