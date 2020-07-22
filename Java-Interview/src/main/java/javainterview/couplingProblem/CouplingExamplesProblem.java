package javainterview.couplingProblem;

//Coupling is a measure of how much a class is dependent on other classes. 
//There should minimal dependencies between classes.
//Consider the example below:

// Good classes will have low coupling.
// This class has high coupling.

class ShoppingCartEntry {
	public float price;
	public int quantity;
}

class ShoppingCart {
	public ShoppingCartEntry[] items;
}

class Order {
	private ShoppingCart cart;
	private float salesTax;

	public Order(ShoppingCart cart, float salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}

	// This method know the internal details of ShoppingCartEntry and
	// ShoppingCart classes. If there is any change in any of those
	// classes, this method also needs to change.
	public float orderTotalPrice() {
		float cartTotalPrice = 0;
		for (int i = 0; i < cart.items.length; i++) {
			cartTotalPrice += cart.items[i].price * cart.items[i].quantity;
		}
		cartTotalPrice += cartTotalPrice * salesTax;
		return cartTotalPrice;
	}
}

public class CouplingExamplesProblem {

}
