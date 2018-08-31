import cs1.Keyboard;
import java.util.Scanner;

public class Kingsisland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int peps;
		float parking$, food$, total$, perpep$;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many People ");
		peps = keyboard.nextInt();

		System.out.print("Parking Amount ");
		parking$ = keyboard.nextInt();

		System.out.print("Food Cost ");
		food$ = keyboard.nextInt();



		total$ = (parking$ + food$);
		perpep$ = (total$/peps);
		System.out.print("Your total is " + total$);
		System.out.print("  Your Average per Person is " + perpep$ + "  ");
	}

}
