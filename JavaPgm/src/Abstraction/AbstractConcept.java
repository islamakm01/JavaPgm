package Abstraction;

abstract class Abs
{
	public  void Image()   //non abstract method
	{
		System.out.println("Tringle");
	}
	
	abstract public  void Color(); //abstract method
}


class ColorsDesign extends Abs
{

	@Override
	public void Color() {
		// TODO Auto-generated method stub
		System.out.println("Purple design");
	}
	
}


public class AbstractConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorsDesign c = new ColorsDesign();
		c.Color();
		c.Image();
		
		//Abs.Image();
		
		
		

	}

}
