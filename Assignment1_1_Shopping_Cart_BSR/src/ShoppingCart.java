
/**
 * The user can perform various actions in their shopping cart with the following methods
 * @author brentreynolds
 *
 * @version 9/6/22 Fall 2022
 */
public interface ShoppingCart<T>{

	/**
	 * @return  returns the number of items in the shopping cart
	 */
	public int getNumberOfItems();
	 
	/**
	 * @return  returns true if the shopping cart is empty, false otherwise
	 */
	public boolean isEmpty();
	 
	/**
	 * @param anItem   the item sent to the method to be added
	 * @return   returns true if the item is successfully added to the cart
	 */
	public boolean addItem(T anItem);
	
	/**
	 * @return   returns the item that was removed from the cart
	 */
	public T removeItem();
	
	/**
	 * @param anItem  the item sent to the method to be removed
	 * @return        returns true if the item was successfully removed from the cart
	 */
	public boolean removeItem(T anItem);
	
	/**
	 *  removes all the items from the cart
	 */
	public void clearAllItems();
	
	/**
	 * @param anItem  the item sent to the method to be counted
	 * @return        the number of times this item appears in the cart
	 */
	public int getFrequencyofItem(T anItem);
	
	/**
	 * @param anItem  the item sent to the method to see if it is in the cart
	 * @return        returns true if the item is in the cart, false otherwise
	 */
	public boolean containsItem(T anItem);
	
	/**
	 * @return returns an array of all the items in the cart
	 */
	public T[] displayItems();
	
	/**
	 * @return  returns the total price of all the items in the cart
	 */
	public double getTotalPriceOfItems();
	
	/**
	 * @return  returns the price of a specific item in a cart
	 */
	public double getItemPrice();
	
	
	 
	 
}
