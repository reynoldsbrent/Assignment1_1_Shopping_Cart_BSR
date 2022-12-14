
/**
 * This application class can add items to a shopping cart and perform various operations on the cart such as
 * removing an item, removing the last item, counting how many items are in the cart, total price of the cart, price of an item,
 *  frequency of an item, and printing the contents of the cart.
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
				GroceryItems apple = new GroceryItems("Apple", 1);
				GroceryItems bananna = new GroceryItems("Bananna", 2);
				GroceryItems pizza = new GroceryItems("Pizza", 3);
				GroceryItems cake = new GroceryItems("Cake", 4);
				GroceryItems bread = new GroceryItems("Bread", 5);
				GroceryItems cookie = new GroceryItems("Cookie", 6);
				GroceryItems avacado = new GroceryItems("Avacado", 7);
				GroceryItems pastry = new GroceryItems("Pastry", 8.5);
				GroceryItems donut = new GroceryItems("Donut", 9.5);
				GroceryItems muffin = new GroceryItems("Muffin", 10.2);
				
				
				// Add these new grocery items to the newly created shopping cart
				aCart.addItem(apple);
				aCart.addItem(bananna);
				aCart.addItem(pizza);
				aCart.addItem(cake);
				aCart.addItem(apple);
				aCart.addItem(bread);
				aCart.addItem(cookie);
				aCart.addItem(avacado);
				aCart.addItem(pastry);
				aCart.addItem(donut);
				aCart.addItem(muffin);
				
				
				//System.out.println(aCart.getTotalPriceOfItems());
				DecimalFormat ft = new DecimalFormat("####");
				ft = new DecimalFormat("$###,###.###");
				
				// Copy these items from the shopping cart into an array of object
				Object [] output = aCart.displayItems();
				
				// Print out the contents of each object in the array
				
				System.out.println("This is a list of the items in the shopping cart: ");
				
				for(int i = 0; i < output.length; i++) {
					System.out.println(output[i]);
				}
				
				
				// Prints out the price of an apple
				System.out.println("The price of an apple is " + ft.format(apple.getDoublePrice()));
				
				// Prints out the total price of the shopping cart
				System.out.println("The total price of the shopping cart is: " + ft.format(aCart.getTotalPriceOfItems()));
				
				// Prints out the number of items in the shopping cart
				System.out.println("There are " + aCart.getNumberOfItems() + " items in the shopping cart");
				
				// Prints out if the shopping cart is empty or not
				System.out.println("Is the shopping cart empty? " + aCart.isEmpty());
				
				// Removes the last item form the shopping cart
				System.out.println("The following item has been removed: " + aCart.removeItem());
				
				// Prints out contents of the cart
				Object [] output1 = aCart.displayItems();
				System.out.println("This is a list of all the items in the shopping cart: ");
				for(int i = 0; i < output1.length; i++) {
					System.out.println(output1[i]);
				}
				
				System.out.println("The total price of the shopping cart is: " + ft.format(aCart.getTotalPriceOfItems()));
				
				// Removes the cake item from the shopping cart
				System.out.println("Has the cake been successfuly removed from the shopping cart? " + aCart.removeItem(cake));
				
				// Removes the cookie item from the shopping cart
				System.out.println("Has the cookie been successfully removed from the shopping cart? " + aCart.removeItem(cookie));
				
				//Removes the avocado item from the shopping cart
				System.out.println("Has the avocodo been removed from the shopping cart? " + aCart.removeItem(avacado));
				
				//Removes the pastry item from the shopping cart
				System.out.println("Has the pastry been removed from the shopping cart? " + aCart.removeItem(pastry));
				
				//Removes the donut item from the shopping cart
				System.out.println("Has the donut been removed from the shopping cart? " + aCart.removeItem(donut));
				
				// Prints out contents of the cart
				Object [] output2 = aCart.displayItems();
				System.out.println("This is a list of all the items in the cart: ");
				for(int i = 0; i < output2.length; i++) {
					System.out.println(output2[i]);
				}
				
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
