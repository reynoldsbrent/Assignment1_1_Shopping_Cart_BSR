
/**
 * @author brentreynolds
 * @version 9/14/22 Fall 2022
 */
import java.text.DecimalFormat;
import java.util.Arrays;
public class Application {

	public static void main(String[] args) {
		// Create a new shopping cart
				ItemCart aCart = new ItemCart();
				
				// Create new grocery items
				GroceryItems apple = new GroceryItems("Apple", 100);
				GroceryItems bananna = new GroceryItems("Bananna", 200);
				GroceryItems pizza = new GroceryItems("Pizza", 300);
				GroceryItems cake = new GroceryItems("Cake", 400);
				GroceryItems bread = new GroceryItems("Bread", 500);
				
				// Add these new grocery items to the newly created shopping cart
				aCart.addItem(apple);
				aCart.addItem(bananna);
				aCart.addItem(pizza);
				aCart.addItem(cake);
				aCart.addItem(apple);
				aCart.addItem(bread);
				
				//System.out.println(aCart.getTotalPriceOfItems());
				DecimalFormat ft = new DecimalFormat("####");
				ft = new DecimalFormat("$###,###.###");
				
				
				// Prints out the total price of the shopping cart
				System.out.println("The total price of the shopping cart is: " + ft.format(aCart.getTotalPriceOfItems()));
				
				// Prints out the price of an apple
				//System.out.println("The price of an apple is " + apple.getPrice());
				System.out.println("The price of an apple is " + ft.format(apple.getIntPrice()));
				
				// Copy these items from the shopping cart into an array of object
				Object [] output = aCart.displayItems();
				
				// Print out the contents of each object in the array
				// System.out.println(Arrays.toString(output));
				System.out.println(output[0]);
				System.out.println(output[1]);
				System.out.println(output[2]);
				System.out.println(output[3]);
				System.out.println(output[4]);
				System.out.println(output[5]);
				
				// Prints out the number of items in the shopping cart
				System.out.println("There are " + aCart.getNumberOfItems() + " items in the shopping cart");
				
				// Prints out if the shopping cart is empty or not
				System.out.println("Is the shopping cart empty? " + aCart.isEmpty());
				
				// Removes the last item form the shopping cart
				System.out.println("The following item has been removed: " + aCart.removeItem());
				
				System.out.println("The total price of the shopping cart is: " + ft.format(aCart.getTotalPriceOfItems()));
				
				// Removes the specified item from the shopping cart
				System.out.println("Has the cake been successfuly removed from the shopping cart? " + aCart.removeItem(cake));
				
				// Prints out the total price of the shopping cart
				System.out.println("The total price of the shopping cart is: " + ft.format(aCart.getTotalPriceOfItems()));
				
				//Prints out the number of items in the cart
				System.out.println("There are " + aCart.getNumberOfItems() + " items in the shopping cart");
				
				// Prints out the number of a specific item in the shopping cart
				System.out.println("Number of apples in the cart: " + aCart.getFrequencyofItem(apple));
				
				// Prints if the specified item is in the shopping cart or not
				System.out.println("Does this cart contain a bananna? " + aCart.containsItem(bananna));
				
				// clears all of the items in the cart
				aCart.clearAllItems();
				System.out.println("All items have been removed from the cart");
				
				// Prints if the shopping cart is empty or not
				System.out.println("Is the shopping cart empty? " + aCart.isEmpty());
				
				// Prints how many items are in the shopping cart
				System.out.println("How many items are in the shopping cart? " + aCart.getNumberOfItems());
				
				// Prints out the total price of the shopping cart
				System.out.println("The total price of the shopping cart is: " + ft.format(aCart.getTotalPriceOfItems()));

	}

}
