import java.util.Random;
import java.util.Scanner;

public class Lab6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String answer = "y";

		do {

			System.out.println("Enter the number of faces on your dice:");

			int faces = input.nextInt();

			if (faces < 1) {

				System.out.println("Enter a number greater than 0.");

				continue;

			}

			else if (faces >= 1) {

				int firstRoll = generateRandomDieRoll(faces);

				System.out.println(firstRoll);

				int secondRoll = generateRandomDieRoll(faces);

				System.out.println(secondRoll);

				if (firstRoll == 1 && secondRoll == 1) {

					System.out.println("You got snake eyes!");

				}

				else if (firstRoll == 6 && secondRoll == 6) {

					System.out.println("You got box cars!");

				}

			}

			System.out.println("Would you like to continue? (y/n)");

			answer = input.next();

		} while (answer.contentEquals("y") || answer.contentEquals("Y"));

		input.close();

	}

	public static int generateRandomDieRoll(int faces) {

		Random random = new Random();

		return (random.nextInt(faces) + 1);

	}
}
