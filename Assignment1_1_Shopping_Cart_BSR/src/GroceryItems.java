
public class GroceryItems implements Item {
	private String description;
	
	private int price;
	
	public GroceryItems(String productDescription, int productPrice) {
		description = productDescription;
		price = productPrice;
	}
	
	
	public String getDescription() {
		return description;
	}

	public String getPrice() {
		return  "$" + price / 100 + "." + price % 100;
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
