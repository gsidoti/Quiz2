package MainPackage;
import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {

		double tuition;

		Scanner input = new Scanner(System.in);

		System.out.println("How much your first year?");
		tuition = input.nextInt();

		int count = 4;
		while (count > 0) {

			double interest;
			System.out.println("What is the interest for this term?: ");
			interest = input.nextDouble();
			double Extra = tuition * interest;
			tuition = +Extra + tuition;
			System.out.printf("Your Tuition for this year comes to : $%.2f", tuition);
			System.out.println();
			count--;
			tuition = tuition;
		}

	}
}
