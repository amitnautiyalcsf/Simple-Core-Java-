package ComparableAndComparatorDiff;

//public class Laptop implements Comparable<Laptop> {

	//if we use comparator then we need to implement comparable or override it's comparTo method
public class Laptop
{
	
	private String brand;
	private int ram;
	private int price;

	
	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public final String getBrand() {
		return brand;
	}
	public final void setBrand(String brand) {
		this.brand = brand;
	}
	public final int getRam() {
		return ram;
	}
	public final void setRam(int ram) {
		this.ram = ram;
	}
	public final int getPrice() {
		return price;
	}
	public final void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
//	@Override
//	public int compareTo(Laptop lap2) 
//	{
//		// this > lap2 = +
//		// this < lap2 = -
//		//this == lap2 = 0
//		
//	 
//		if(this.getRam()>lap2.getRam())
//		{
//			return 1;
//			
//		}
//		else 
//		{
//			return -1;
//		}
// 		
//	}

	
	
}
