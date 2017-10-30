package Progress.conditions;

public class AdvancedConditions {

	public static void main(String[] args) {
		int first = 100;
		int second = 100;

		if (first == second) {
			System.out.println("These two numbers are equals");
		} else {
			if (first > second) {
				System.out.println("The first number is greater");
			} else {
				System.out.println("The second number is greater");
			}
		}
	}
}
