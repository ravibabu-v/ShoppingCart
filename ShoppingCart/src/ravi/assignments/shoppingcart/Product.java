package ravi.assignments.shoppingcart;

public abstract class Product {
	int price;
    String model=new String();
    String manufacturer = new String();
	public int getPrice() {
		return price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
