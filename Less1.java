package guvi1;
import java.util.Scanner;
public class Less1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=0;
		int f=0;
		for(int i=a;i<=b;i++)
		{
			e=e+i;
		}
		for(int i=c;i<=d;i++)
		{
			f=f+i;
		}

		System.out.println(e);
		System.out.println(f);
	}

}
