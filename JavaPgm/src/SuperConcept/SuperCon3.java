package SuperConcept;

class Vehicle{
	private int numwheels;

	public Vehicle(int numwheels) {
		this.numwheels = numwheels;
	}

	public int getNumwheels() {
		return numwheels;
	}
}

class Car extends Vehicle{

	private String brand;

	public Car(int numwheels, String brand) {
		super(numwheels);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	
	
	
}




public class SuperCon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(4,"Toyota");
		
		System.out.println(car.getNumwheels() + "Wheels");
		System.out.println(car.getBrand() + "Brand");

	}

}
