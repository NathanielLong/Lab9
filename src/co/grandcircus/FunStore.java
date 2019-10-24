package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FunStore {
	public static void main(String[] args) {
		System.out.println("Welcome to Nathaniel's Market!");
		Map<String, Double> items = new HashMap<>();
		items.put("Pineapple", 2.75);
		items.put("Apple", 0.99);
		items.put("Clementines", 3.99);
		items.put("Pears", 2.99);
		items.put("Fish", 4.99);
		items.put("Soup", 1.99);
		items.put("Steak", 9.99);
		items.put("Pizza", 34.99);
		ArrayList<String> itemName = new ArrayList<>();
		itemName.add("pineapple");
		itemName.add("apples");
		itemName.add("clementines");
		itemName.add("pears");
		itemName.add("fish");
		itemName.add("soup");
		itemName.add("steak");
		itemName.add("pizza");
		ArrayList<Double> itemPrice = new ArrayList<>();
		itemPrice.add(2.75);
		itemPrice.add(0.99);
		itemPrice.add(3.99);
		itemPrice.add(2.99);
		itemPrice.add(4.99);
		itemPrice.add(1.99);
		itemPrice.add(9.99);
		itemPrice.add(34.99);
		ArrayList<String> usersItems = new ArrayList<>();
		ArrayList<Double> usersItemsPrices = new ArrayList<>();
		boolean isValid = false;
		char userRetry;
		do {
		System.out.println();
		System.out.println("Items              Price");
		System.out.println("==============================");
		for (String key : items.keySet()) {
			System.out.printf("%-18s $%-4.2f", key, items.get(key));
			System.out.println();
		}
		System.out.println("What item would you like to order: ");
		Scanner scan = new Scanner(System.in);
		String userOrder = scan.next();
		if (itemName.contains(userOrder.toLowerCase())) {
			usersItems.add(userOrder);
			int numOfUserOrder = itemName.indexOf(userOrder);
			double userOrderPrice = itemPrice.get(numOfUserOrder);
			usersItemsPrices.add(userOrderPrice);
			System.out.println("Adding " + itemName.get(numOfUserOrder) + " to cart at $" + itemPrice.get(numOfUserOrder));
			System.out.println("Would you like to add anything else? (y/n): ");
			userRetry = scan.next().charAt(0);
			if (userRetry == 'y') {
				isValid = false;
			} else {
				isValid = true;
			}
			
		} else {
			isValid = false;
			System.out.println("Sorry, we dont have any of those. Please try again.");
		}
		} while(!isValid);
		System.out.println("Thanks for your order!");
		System.out.println("Here's what you got:");
		for (int i = 0; i < usersItems.size(); i++) {
			System.out.println(usersItems.get(i) + " $" + usersItemsPrices.get(i) + ".");
		}
	}
}
