package ravi.assignments.shoppingcart;

import java.util.ArrayList;

public class ShoppingCart {
	int tax=13;
	ArrayList<Product> cart = new ArrayList<Product>();
	Customer cust=new Customer();
    
	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public ArrayList<Product> getCart() {
		return cart;
	}

	public void setCart(ArrayList<Product> cart) {
		this.cart = cart;
	}

	public Customer getCustomer() {
		return cust;
	}

	public void setCustomer(Customer cust) {
		this.cust = cust;
	}

	public void addProduct(Product pr) {
		cart.add(pr);
	}
	
    public void removeProduct(Product pr) {
		cart.remove(pr);
	}
    
    public int checkOut() {
    	printCart();
    	int subTotal=getSubTotal();
    	int total=subTotal+(subTotal*tax/100);
    	System.out.println("Sub Total:\t---------- \t:"+subTotal);
    	System.out.println("Total:\t\t---------- \t:"+total);
    	System.out.println("Shipping Cost: ---------- \t:"+cust.getShippingCost());
    	int totalWithShipping=total+cust.getShippingCost();
    	System.out.println("Total with Shipping: ------ \t:"+totalWithShipping);
		System.out.println("\t******************************");
    	return total;
    }
    public int getSubTotal() {
    	int ret=0;
    	for(int i=0; i<cart.size();i++) {
    	   ret+=cart.get(i).getPrice();	
    	}
    	return ret;
    }
    
    public void printCart() {
    	for(int i=0; i<cart.size();i++) {
    	  System.out.println(printProduct(cart.get(i)));	
    	}
    }
    
    public String printProduct(Product pr) {
    	char delimiter = '\t';
    	String indentation = "\t----------\t:";
    	return pr.getManufacturer()+delimiter+pr.getModel()+indentation+pr.getPrice();
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	//return super.toString();
    	char delimiter = '\t';
    	String indentation = "\t----------\t:";
    	StringBuffer ret= new StringBuffer();
    	for(int i=0; i<cart.size();i++) {
    	  ret.append(cart.get(i).getManufacturer()
    			     +delimiter+cart.get(i).getModel()
    			     +indentation+cart.get(i).getPrice()+'\n');
    	}
    	return ret.toString();
    }
}

