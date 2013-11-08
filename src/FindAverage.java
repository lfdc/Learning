import java.util.Arrays;

public class FindAverage {

	public static void main(String args[]) {
		double[] marks = { Input.getDouble(), Input.getDouble(),
				Input.getDouble(), Input.getDouble() };

		double average = 0;

		System.out.println(Arrays.toString(marks));

		average = (marks[0] + marks[1] + marks[2] + marks[3]) / marks.length;

		System.out.println("Your average is: " + average);
		if (average >= 80) {

			System.out.print("Honour Roll");

		}
		
		if (average < 80 && average >= 50){
			System.out.println("Not On Honour Roll");
		
		}
		
		if (average < 50){ 
			System.out.println("FAIL");
		}
	}

}
