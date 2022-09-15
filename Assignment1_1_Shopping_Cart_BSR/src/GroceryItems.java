
/**
 * @author brentreynolds
 * @version 9/15/2022 Fall 2022
 */
public class GroceryItems implements Item {
	private String description;
	
	private int price;
	private double totalPrice;
	
	/**
	 * @param productDescription  the value of productDescription based on the calling method
	 * @param productPrice        the value of productPrice based on the calling method
	 */
	public GroceryItems(String productDescription, int productPrice) {
		description = productDescription;
		price = productPrice;
		totalPrice = totalPrice + price;
	}
	
	
	/**
	 * @return  the name of the item
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return  a string version of the item price
	 */
	public String getPrice() {
		return  "$" + price / 100 + "." + price % 100;
	}
	
	
	/**
	 * @return  an int version of the item price
	 */
	public double getIntPrice() {
		return this.price / 100 + this.price % 100;
	}
	
	/**
	 * @return  the total price of the shopping cart
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	
	/** 
	 * This method returns the name of the item as well as the price of an item in a string
	 *
	 */
	public String toString() {
		return description + "\t$" + price + "." + price ;
	}
	
	/**
	 * This method adds the name of the item
	 *
	 */
	@Override
	public boolean addNameOfItem() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This method adds the price of an item
	 *
	 */
	@Override
	public boolean addPriceOfItem() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 *This method adds the item code
	 *
	 */
	@Override
	public boolean addItemCode() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This method adds the item description
	 *
	 */
	@Override
	public boolean addItemDescription() {
		// TODO Auto-generated method stub
		return false;
	}

}
