public class MainClass {

	public static void main(String args[]) {
		int firstNumber = Input.getNumber();
		int secondNumber = Input.getNumber();
		char operator = Input.getOperator();
		int answer = 0;

		if (operator == '*') {
			answer = firstNumber * secondNumber;
		}
		if (operator == '-') {
			answer = firstNumber - secondNumber;
		}
		if (operator == '/') {
			answer = firstNumber / secondNumber;
		}
		if (operator == '+') {
			answer = firstNumber + secondNumber;
		}

		System.out.println(answer);
	}

}
