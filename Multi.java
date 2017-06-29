package guvi;
import java.util.Scanner;
public class Multi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b;
		for(int i=1;i<=10;i++)
		{
			b=i*a;
			System.out.println(i+" x "+a+"  = "+b);
		}

	}

}
