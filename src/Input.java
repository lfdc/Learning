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
		while(true)
		{
			try
			{
				System.out.println("Enter operator");
				String charString = getInput();
				char character;
				if(charString.length() != 1)
				{
					continue;
				}
				
				character = charString.charAt(0);
				
				switch(character)
				{
				case '+':
				case '-':
				case '*':
				case '/':
					return character;
				}
				
				continue;
			}
			catch(Exception e){}
		}
	}
	
	private static String getInput()
	{
		Scanner scanner = new Scanner(System.in);
		
		return scanner.next();
	}
	
}
