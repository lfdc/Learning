import java.util.Scanner;


public class MainClass {

	public static void main(String args[])
	{
		int firstNumber = Input.getNumber();
		int secondNumber = 2;
		char operator = Input.getOperator();
		int answer = 0;
		
		
		
		if (operator == '*')
		{
			answer = firstNumber * secondNumber;
		}
		if (operator == '-')
		{
			answer = firstNumber - secondNumber;
		}
		if (operator == '/')
		{
			answer = firstNumber / secondNumber;
		}
		if (operator == '+')
		{
			answer = firstNumber + secondNumber;
		}
		
		System.out.println(answer);
	}
	
}
