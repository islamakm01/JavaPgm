package SuperConcept;

class Car1
{
	public void Color()
	{
		System.out.println("Blue");
	}
	
	public void Engine()
	{
		System.out.println("1500cc");
	}
	
	public void AirBag()
	{
		System.out.println("Avaialable on Automatic variant");
	}
}


class Car2 extends Car1
{
	public void Color()
	{
		System.out.println("Red");
	}
	
	public void Engine()
	{
		System.out.println("1800cc");
	}
	
	public void AirBag()
	{
		System.out.println("Avaialable on Automatic and Top Model variant");
	}
	
	public void getDetails()
	{
		Color();
		super.Engine();
		AirBag();
	}
}

public class SuperWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 c = new Car2();
		c.getDetails();

	}

}
