public class HighLow {

	public static void main(String[] args) {
		int randomNumber = MethodsExercises.generateRandomNumber(1, 100);
		boolean guesses = false;

		System.out.println("Welcome to the High-Low guessing game!");
		System.out.println("I have picked a random number between 1 and 100.");
		System.out.println("Let's see if you can guess it!");

		while (!guesses) {
			int userGuess = MethodsExercises.getUserGuess();
			if (userGuess < randomNumber) {
				System.out.println("HIGHER");
			} else if (userGuess > randomNumber) {
				System.out.println("LOWER");
			} else {
				System.out.println("YOU GOT IT!");
				guesses = true;
			}
		}
	}
}
