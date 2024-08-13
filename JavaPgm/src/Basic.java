
 class Base
{
	public void Color()
	{
		System.out.println("Blue");
	}
}

public class Basic {
	
	public void Shape() //User define method nd we can change any time
	{
		System.out.println("Tringle");
	}
	
	public void Booking()
	{
		System.out.println("Hotel");
	}
	
	//Java define method and we cant change - it should be one only 

	public static void main(String[] args) { 
		
		System.out.println("Testing");
		
		//Object creation
		
		//classname ref = new Constructor();
		//ref.userdefinemethod();
		
		Basic b = new Basic();
		b.Shape();
		b.Booking();
		
		Base b1 = new Base();
		b1.Color();
		
		
		

	}

}
