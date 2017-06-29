package guvi1;
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int LCM = 0;
		s.close();
		for(int i=a;i<a*b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				LCM=i;
			}
		}
		System.out.println(LCM);
	}

}
