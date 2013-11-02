import java.util.Scanner;


public class Input {

	public static int getNumber()
	{
		while(true)
		{
			try
			{
				System.out.println("Enter number");
				String numString = getInput();
				
				int num = Integer.parseInt(numString);
				
				return num;
			}
			catch(Exception e){}
		}
	}
	
	public static char getOperator()
	{
		return '-';
	}
	
	private static String getInput()
	{
		Scanner scanner = new Scanner(System.in);
		
		return scanner.next();
	}
	
}
