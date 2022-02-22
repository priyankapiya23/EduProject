package packageexample;

public class BeanClass implements Comparable {
	String color;
	double price;
	String brand;
	
	
	public BeanClass(String color, String brand,double price) {
		// TODO Auto-generated constructor stub
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		BeanClass bn=(BeanClass) o;
		if(price==bn.price)
		{
			return 0;
		}
		else if(price>bn.price)
		{
			return 1;
		}
		else {
			return -1;
		}
		
	}


	

}
