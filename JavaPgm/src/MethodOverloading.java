class MOL
{
	public void ABC(String a , int b)
	{
		System.out.println("calling String and Int");
	}
	
	public void ABC(int a , String b)
	{
		System.out.println("calling int and String");
	}
	
	public void ABC(int a , long b)
	{
		System.out.println("calling int and long");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOL m = new MOL();
		m.ABC("Blue",20);
		m.ABC(20, "White");
		m.ABC(10, 20);

	}

}
