
public class ItemCart<T> implements ShoppingCart{
	//ResizableArrayBag cartBag = new ResizableArrayBag();
	
		private ResizableArrayBag cartBag = new ResizableArrayBag();
		
		ItemCart(){
			cartBag = new ResizableArrayBag();
			
		}
		

		@Override
		public int getNumberOfItems() {
			// TODO Auto-generated method stub
			return cartBag.getCurrentSize();
			
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return cartBag.isEmpty();
			
		}

		@Override
		public boolean addItem(Object anItem) {
			// TODO Auto-generated method stub
			return cartBag.add(anItem);
			
		}

		@Override
		public Object removeItem() {
			// TODO Auto-generated method stub
			return cartBag.remove();
			
		}

		@Override
		public boolean removeItem(Object anItem) {
			// TODO Auto-generated method stub
			return cartBag.remove(anItem);
			
		}

		@Override
		public void clearAllItems() {
			// TODO Auto-generated method stub
			cartBag.clear();
			
		}

		@Override
		public int getFrequencyofItem(Object anItem) {
			// TODO Auto-generated method stub
			return cartBag.getFrequencyOf(anItem);
			
		}

		@Override
		public boolean containsItem(Object anItem) {
			// TODO Auto-generated method stub
			return cartBag.contains(anItem);
			
		}

		@Override
		public Object[] displayItems() {
			// TODO Auto-generated method stub
			return cartBag.toArray();
		}
		public Object [] copyToArray() {
			return cartBag.toArray();
		}

		@Override
		public double getTotalPriceOfItems() {
			Object[] localCart = cartBag.toArray();
			double sum = 0;
		for(int i = 0; i < localCart.length; i++) {
			sum += ((GroceryItems) localCart[i]).getIntPrice();
		}
			return sum;
		}

		@Override
		public double getItemPrice() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
}
