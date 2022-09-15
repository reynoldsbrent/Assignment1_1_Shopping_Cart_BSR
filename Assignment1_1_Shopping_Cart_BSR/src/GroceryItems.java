
/**
 * @author brentreynolds
 * @version 9/15/2022 Fall 2022
 */
public class GroceryItems implements Item {
	private String description;
	
	private int price;
	private double totalPrice;
	public GroceryItems(String productDescription, int productPrice) {
		description = productDescription;
		price = productPrice;
		totalPrice = totalPrice + price;
	}
	
	
	public String getDescription() {
		return description;
	}

	public String getPrice() {
		return  "$" + price / 100 + "." + price % 100;
	}
	
	
	public double getIntPrice() {
		return this.price / 100 + this.price % 100;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public String toString() {
		return description + "\t$" + price / 100 + "." + price % 100;
	}
	
	@Override
	public boolean addNameOfItem() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPriceOfItem() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addItemCode() {
		// TODO Auto-generated method stub
		return false;
	}
	


	@Override
	public boolean addItemDescription() {
		// TODO Auto-generated method stub
		return false;
	}

}
