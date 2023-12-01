package cafeProject;

public class FoodItem {
	
	private String name;
	private String description;
	private double price;
	
	
	
	public FoodItem (String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		
	// getter methods
	}
	public String returnName() {
		return this.name;
	}
	public String returnDescription() {
		return this.description;
	}
	public double returnPrice() {
		return this.price;
	}
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
