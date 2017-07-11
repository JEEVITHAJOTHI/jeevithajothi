package Logic;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.next();
	int b=a.length();
	char c;
	int d=0;
	for(int i=0;i<b;i++)
	{
		c=a.charAt(i);
		if(Character.isDigit(c))
		{
			d++;
		}
	}
		System.out.println(d);
	}

}
