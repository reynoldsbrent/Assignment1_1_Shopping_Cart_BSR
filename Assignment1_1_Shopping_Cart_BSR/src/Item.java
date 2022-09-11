
/**
 * The user can change the name and price of an item with these methods
 * @author brentreynolds
 *
 * @version 9/6/22 Fall 2022
 */
public interface Item<T>{
	
	
	/**
	 * @return  returns true if the name of the item was successfully added
	 */
	public boolean addNameOfItem();
	
	/**
	 * @return  returns true if the price of the item was successfully added
	 */
	public boolean addPriceOfItem();
	
	/**
	 * @return  returns true if the item code was successfully added
	 */
	public boolean addItemCode();
	
	/**
	 * @return  returns true if the item description was successfully added
	 */
	public boolean addItemDescription();
	
	/**
	 * @return the description and the price of the item
	 */
	public String toString();

}