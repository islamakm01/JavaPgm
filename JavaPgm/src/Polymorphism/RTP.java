package Polymorphism;

abstract class Animal
{
	abstract public void Voice();
	
}


class Tiger extends Animal
{
	public void Voice()
	{
		System.out.println("Roaring");
	}
}

class Dog extends Animal
{
	public void Voice()
	{
		System.out.println("Barking");
	}
}

class Cat extends Animal
{
	public void Voice()
	{
		System.out.println("Meow");
	}
}

public class RTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i = 10;
		
		Animal a = new Dog();
		a.Voice();
		
		//WebDriver driver = new Safar()  //RTP

	}

}
