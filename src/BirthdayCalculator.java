import java.util.Scanner;

public class BirthdayCalculator 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("BIRTHDAY CALCULATOR");
		System.out.print("\nPress enter to start");
		input.nextLine();
		System.out.print("\nEnter the year the person was born:  ");
		int yr1 = input.nextInt();
		System.out.print("Enter the month the person was born:  ");
		int mnth1 = input.nextInt();
		System.out.print("Enter the day the person was born:  ");
		int d1 = input.nextInt();
		System.out.print("\nEnter the year the second person was born:  ");
		int yr2 = input.nextInt();
		System.out.print("Enter the month the second person was born:  ");
		int mnth2 = input.nextInt();
		System.out.print("Enter the day the second person was born:  ");
		int d2 = input.nextInt();
		
		if (yr1 > yr2)
		{
			System.out.print("\nPerson one is older");
		}
		else if (yr2 > yr1)
		{
			System.out.print("\nPerson two is older");
		}
		else if (yr1 == yr2)
		{
			if (mnth1 > mnth2)
			{
				System.out.print("\nPerson one is older");
			}
			else if (mnth2 > mnth1)
			{
				System.out.print("\nPerson two is older");
			}
			else if (mnth1 == mnth2)
			{
				if (d1 > d2)
				{
					System.out.print("\nPerson one is older");
				}
				else if (d2 > d1)
				{
					System.out.print("\nPerson two is older");
				}
				else if (d1 == d2)
				{
					System.out.print("\nThey are the same age");
				}
			}
		}

	}

}
