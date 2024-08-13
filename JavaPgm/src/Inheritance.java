class GP 
{
	public void GPFeature()
	{
		System.out.println("calling GP Feature");
	}
}

class Parent 
{
	
	
	public void ParentFeature()
	{
		System.out.println("calling Parent Feature");
	}
}

class Child extends Parent 
{
	public void ChildFeature()
	{
		System.out.println("Child Feature");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.ChildFeature();
		c.ParentFeature();
		//c.GPFeature();

	}

}
