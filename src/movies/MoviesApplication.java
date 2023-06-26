package movies;

import util.Input;

public class MoviesApplication {

	public static void main(String[] args) {
		movieSearch();
	}

	public static void movieSearch() {
		Input input = new Input();
		System.out.println("WELCOME TO MOVIE CONSOLE");

		int choice;
		do {
			System.out.println("\nSelect an option:\n" +
					"1 - All movies\n" +
					"2 - Movie categories\n" +
					"0 - EXIT");

			choice = input.getInt();

			switch (choice) {
				case 1:
					displayMovies(MoviesArray.findAll());
					break;
				case 2:
					displayMoviesByCategory();
					break;
				case 0:
					System.out.println("Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					break;
			}
		} while (choice != 0);
	}

	public static void displayMovies(Movie[] movies) {
		System.out.println("All movies:");
		for (Movie movie : movies) {
			System.out.printf("%s - %s\n", movie.movieTitle(), movie.movieCategory());
		}
	}

	public static void displayMoviesByCategory() {
		Input input = new Input();
		System.out.println("1 - Animated\n" +
				"2 - Drama\n" +
				"3 - Horror\n" +
				"4 - SciFi\n");

		int choice = input.getInt();

		Movie[] movies = MoviesArray.findAll();

		String categoryName = getCategoryName(choice);
		System.out.printf("%s movies:\n", categoryName);

		for (Movie movie : movies) {
			if (intCategory(movie.movieCategory()) == choice) {
				System.out.printf("%s\n", movie.movieTitle());
			}
		}
	}

	public static int intCategory(String category) {
		switch (category.toLowerCase()) {
			case "animated":
				return 1;
			case "drama":
				return 2;
			case "horror":
				return 3;
			case "scifi":
				return 4;
			default:
				return 0;
		}
	}

	public static String getCategoryName(int categoryCode) {
		switch (categoryCode) {
			case 1:
				return "Animated";
			case 2:
				return "Drama";
			case 3:
				return "Horror";
			case 4:
				return "SciFi";
			default:
				return "Unknown";
		}
	}
}
