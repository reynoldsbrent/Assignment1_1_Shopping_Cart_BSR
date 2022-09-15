
/**
 * This class contains methods to allow the user to perform various operations on the shopping cart
 * @author brentreynolds
 * @version 9/15/2022
 * @param <T>
 */
public class ItemCart<T> implements ShoppingCart{
	//ResizableArrayBag cartBag = new ResizableArrayBag();
	
		private ResizableArrayBag cartBag = new ResizableArrayBag();
		
		/**
		 * No argument constructor that creates a new ResizableArrayBag
		 */
		ItemCart(){
			cartBag = new ResizableArrayBag();
			
		}
		

		/**
		 * @return the number of items in the shopping cart
		 */
		@Override
		public int getNumberOfItems() {
			// TODO Auto-generated method stub
			return cartBag.getCurrentSize();
			
		}

		/**
		 * @return true if the shopping cart is empty, false if it is not empty
		 */
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return cartBag.isEmpty();
			
		}

		/**
		 * @param the object that calls this method
		 * @return true if the items has been added to the cart, false if it has not been added to the cart
		 */
		@Override
		public boolean addItem(Object anItem) {
			// TODO Auto-generated method stub
			return cartBag.add(anItem);
			
		}

		/**
		 * @return the object that has been removed from the cart
		 */
		@Override
		public Object removeItem() {
			// TODO Auto-generated method stub
			return cartBag.remove();
			
		}

		/**
		 * @param the object that calls this method
		 * @version true if the object has been successfully removes, false if it has not been removed
		 */
		@Override
		public boolean removeItem(Object anItem) {
			// TODO Auto-generated method stub
			return cartBag.remove(anItem);
			
		}

		/**
		 * This method empties the whole cart
		 */
		@Override
		public void clearAllItems() {
			// TODO Auto-generated method stub
			cartBag.clear();
			
		}

		/**
		 * @param the object the calls this method
		 * @return the number of times this object is in the bag
		 */
		@Override
		public int getFrequencyofItem(Object anItem) {
			// TODO Auto-generated method stub
			return cartBag.getFrequencyOf(anItem);
			
		}

		/**
		 * @param the object that calls this method
		 * @return true if the cart contains this item, false if it does not
		 */
		@Override
		public boolean containsItem(Object anItem) {
			// TODO Auto-generated method stub
			return cartBag.contains(anItem);
			
		}

		/**
		 * @return an array of object type
		 */
		@Override
		public Object[] displayItems() {
			// TODO Auto-generated method stub
			return cartBag.toArray();
		}
		/**
		 * @return an array of object type
		 */
		public Object [] copyToArray() {
			return cartBag.toArray();
		}

		/**
		 * @return the total price of the shopping cart
		 */
		@Override
		public double getTotalPriceOfItems() {
			Object[] localCart = cartBag.toArray();
			double sum = 0;
		for(int i = 0; i < localCart.length; i++) {
			sum += ((GroceryItems) localCart[i]).getDoublePrice();
		}
			return sum;
		}

		/**
		 * @return the price of the item
		 */
		@Override
		public double getItemPrice() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
}
