package finalKeyword;

 class Parent
{
	public void ParentFeature()
	{
		System.out.println("calling parent feature");
	}
}

class Child extends Parent
{
	public void ChildFeature()
	{
		System.out.println("child Feature");
	}
	
	public void ParentFeature()
	{
		
	}
}

public class FinalWithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
