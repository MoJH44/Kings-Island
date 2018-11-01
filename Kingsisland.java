import cs1.Keyboard;
import java.util.Scanner;

public class Kingsisland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int peps;
		double parking$, food, total$, perpep$, unused;
		Scanner keyboard = new Scanner(System.in);

		

		System.out.print("How many People ");
		peps = keyboard.nextInt();

		System.out.print("Parking Amount ");
		parking$ = keyboard.nextDouble();

		System.out.print("Food Cost ");
		food = keyboard.nextDouble();



		total$ = (parking$ + food$);
		perpep$ = (total$/peps);
		System.out.printf("Your total is " + total$);
		System.out.printf("  Your Average per Person is " + perpep$ + "  ");
		
		System.out.print("Random Num ");
		unused = keyboard.nextInt();
	}

}
