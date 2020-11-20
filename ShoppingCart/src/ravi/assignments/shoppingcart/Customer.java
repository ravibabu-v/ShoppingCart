package ravi.assignments.shoppingcart;

public class Customer {
 String Name = new String();
 String Address = new String();
 String CustomerType = new String();
 int shippingCost;

 Customer(){
	 CustomerType = "regular";
	 shippingCost=10;
 }
 Customer(String str){
	 Name = str;
	 CustomerType = "regular";
	 shippingCost=10;
 }
 Customer(String str1, String str2){
	 Name = str1;
	 Address = str2;
	 CustomerType = "regular";
	 shippingCost=10;
 }
 Customer(String str1, String str2, String str3){
	 Name = str1;
	 Address = str2;
	 if(str3.equalsIgnoreCase("premium"))
	 {
		 CustomerType="premium";
		 shippingCost=0;	 
	 }
	 else
	 {
		 CustomerType="regular";
		 shippingCost=10;	 
	 }	 
 }

 public String getName() {
	return Name;
 }
 public void setName(String name) {
	Name = name;
 }
 public String getAddress() {
	return Address;
 }
 public void setAddress(String address) {
	Address = address;
 }
 public String getCustomerType() {
		return CustomerType;
	}
 public void setCustomerType(String customerType) {
		CustomerType = customerType;
		if (CustomerType.equalsIgnoreCase("premium"))
		shippingCost=0;
	}
 public int getShippingCost() {
		return shippingCost;
	}
 public void setShippingCost(int shippingCost) {
		this.shippingCost = shippingCost;
	}
	
}
