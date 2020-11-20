package ravi.assignments.shoppingcart;

public class Simulation {
	
	public static void main(String[] args) {
		Customer C1 = new Customer("Ravi","XYZ","premium");
		Customer C2 = new Customer("Poornima","XYZ");
		ShoppingCart SC1 = new ShoppingCart();
		SC1.setCustomer(C1);
		ApplePhone AP1 = new ApplePhone();
		SC1.addProduct(AP1);
		SC1.addProduct(new SamsungTV());
		SC1.checkOut();
		SC1.setCustomer(C2);
		SC1.checkOut();
		//System.out.println(SC1);	
	}

}
