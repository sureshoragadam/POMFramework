package test.java;

public class laptop {
	
	public String brand;
	public Integer ram;
	public Float price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	public laptop(String brand, Integer ram, Float price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	

}
