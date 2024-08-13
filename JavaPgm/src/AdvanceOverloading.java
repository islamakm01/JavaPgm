class AOL
{
	public void Test(int a , long b)
	{
		System.out.println("calling int and long");
	}
	
	public void Test(long a , int b)
	{
		System.out.println("calling long and int");
	}
	
	public void Test(int a , double b)
	{
		System.out.println("calling int and double");
	}
	
	public void Test(char a , boolean b)
	{
		System.out.println("calling char and boolean");
	}
}
public class AdvanceOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AOL a = new AOL();
		a.Test(10l, 20);
		a.Test(10, 10.5f);
		a.Test('a', false);
		
		A aa = new A();
		//aa.Test(0, 333);
		
		

	}

}

class A {
	public void Test(short a, byte b) {
		System.out.println("Calling short and byte");
	}
}
