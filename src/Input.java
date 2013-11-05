import java.util.Scanner;


public class Input {

	@Deprecated
	public static int getNumber()
	{
		while(true)
		{
			try
			{
				System.out.println("Enter number");
				String numString = getNextWord();
				
				int num = Integer.parseInt(numString);
				
				return num;
			}
			catch(Exception e){}
		}
	}
	
	public int getInteger()
	{
		while(true)
		{
			try
			{
				String numString = getNextWord();
				
				int num = Integer.parseInt(numString);
				
				return num;
			}
			catch(Exception e){}
		}
	}
	
	public int getInteger(String message)
	{
		System.out.println(message);
		return getInteger();
	}
	
	public double getDouble()
	{
		while(true)
		{
			try
			{
				String numString = getNextWord();
				double num = Double.parseDouble(numString);
				return num;
			}
			catch(Exception e){}
		}
	}
	
	public double getDouble(String message)
	{
		System.out.println(message);
		return getDouble();
	}
	
	public char getCharacter()
	{
		while(true)
		{
			String string = getString();
			if(string.length() != 1)
			{
				continue;
			}
			return string.charAt(0);
		}
	}
	
	public char getCharacter(String message)
	{
		System.out.println(message);
		return getCharacter();
	}
	
	public String getString()
	{
		return getNextLine();
	}
	
	public String getString(String message)
	{
		System.out.println(message);
		return getString();
	}
	
	public static char getOperator()
	{
		while(true)
		{
			try
			{
				System.out.println("Enter operator");
				String charString = getNextWord();
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
	
	private static String getNextWord()
	{
		Scanner scanner = new Scanner(System.in);
		
		return scanner.next();
	}
	
	private static String getNextLine()
	{
		Scanner scanner = new Scanner(System.in);
		
		return scanner.nextLine();
	}
	
}
