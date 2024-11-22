import java.util.*;

class Dish {
	public String name;
	public float cost;

	Dish(String name, float cost) {
		this.name = name;
		this.cost = cost;
	}
}

class Restaurant {
	public String name;
	public String location;
	public Dish[] dishes;

	Restaurant(String name, String location, Dish[] dishes) {
		this.name = name;
		this.location = location;
		this.dishes = dishes;
	}
}

public class App {
	public static void main(String[] args) {
		System.out.println("Hello, Docker!");

		Restaurant[] restaurants = {
			new Restaurant(
				"East Coast by madras square",
				"ECR",
				new Dish[] {
					new Dish(
						"Pasta",
						299
					),
					new Dish(
						"Pizza",
						599
					)
				}
			),
			new Restaurant(
				"Brod's Bakery",
				"Pallikaranai",
				new Dish[] {
					new Dish(
						"Almond Cake",
						499
					),
					new Dish(
						"Kombucha",
						299
					)
				}
			),
			new Restaurant(
				"InterContinental",
				"Mahabalipuram",
				new Dish[] {
					new Dish(
						"Croissants",
						219
					),
					new Dish(
						"French Toast",
						179
					)
				}
			)
		};

		String[] locations = getUniqueLocationsFromRestaurants(restaurants);

		String selectedLocation = getValidResponse("Choose from our available locations", locations);

		Restaurant[] restaurantsInLocation = getRestaurantsInLocation(restaurants, selectedLocation);

		System.out.println("Matching restaurants: " + restaurantsInLocation.length);
	}

	public static Restaurant[] getRestaurantsInLocation(Restaurant[] restaurants, String location) {
		List<Restaurant> restaurantsInLocation = new ArrayList<>();

		for (Restaurant restaurant : restaurants) {
			if (restaurant.location.equals(location)) {
				restaurantsInLocation.add(restaurant);
			}
		}

		return restaurantsInLocation.toArray(new Restaurant[0]);
	}

	public static String[] getUniqueLocationsFromRestaurants(Restaurant[] restaurants) {
		Set<String> uniqueLocations = new HashSet<>();

		for (Restaurant restaurant : restaurants) {
			uniqueLocations.add(restaurant.location);
		}

		return uniqueLocations.toArray(String[]::new);
	}

	public static String getValidResponse(String question, String[] options) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// Display the question
			System.out.println(question);
			// Display the options with numbers
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ". " + options[i]);
			}

			System.out.print("Enter the number of your choice: ");

			// Validate input
			if (scanner.hasNextInt()) {
				int choice = scanner.nextInt();

				if (choice >= 1 && choice <= options.length) {
					return options[choice - 1]; // Return the chosen option
				} else {
					System.out.println("Invalid choice. Please enter a number between 1 and " + options.length + ".");
				}
			} else {
				System.out.println("Invalid input. Please enter a number.");
				scanner.next(); // Consume invalid input
			}
		}
	}
}
