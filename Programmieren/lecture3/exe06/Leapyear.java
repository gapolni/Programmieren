package exe06;
import java.util.Scanner;

public class Leapyear 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a year: ");
		int year = sc.nextInt();
		if (year%4 == 0 && year%100 !=0 || year%400 == 0  ) 
		{
			System.out.println(year+" is a leapyear");
		}
		else 
		{
			System.out.println(year+" is not a leapyear");	
		}
		sc.close();
	}
}
