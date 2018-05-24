import java.util.Scanner; 	/*used for input */

public class calc
{
	public static void main(String[] args)
	{
		int num1, num2; /*create two int variables */
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter Num 1: ");
		num1 = input.nextInt();
		System.out.println("Enter Num 2: ");
		num2 = input.nextInt();
			/*calculate the addition and print to screen*/
		System.out.println("Answer " + (num1+num2));
	}
}

