class Animal
{
	public void Category()
	{
		System.out.println("Animal");
	}
}

class Cat extends Animal
{
	public void Voice()
	{
		System.out.println("Meow");
	}
}

class Dog extends Animal
{
	public void Voice()
	{
		System.out.println("Bark");
	}
}


class Tiger extends Animal
{
	public void Voice()
	{
		System.out.println("Roaring");
	}
}
public class ManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger t = new Tiger();
		t.Voice();
		t.Category();

	}

}
