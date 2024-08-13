class KFCAmerica
{
	final public void getProduct()
	{
		System.out.println("KFC");
	}
	
	public void Location()
	{
		System.out.println("California");
	}
}

class KFCUk extends KFCAmerica
{
	public void OwnProduct()
	{
		System.out.println("Pizza");
	}
	
	public void Location()
	{
		System.out.println("London");
	}
}

class KFCIndia extends KFCAmerica
{
	public void Location()
	{
		System.out.println("Hyderabad");
	}
}
public class MethodOverridingRealUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KFCAmerica k = new KFCUk();
		k.Location();
		k.getProduct();
		//k.OwnProduct();

	}

}
