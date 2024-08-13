class Cons
{
	
	 Cons(String a)
	{
		System.out.println("Constructor"+a);
	}
	
	Cons(int a )
	{
		System.out.println("calling int");
	}
	
	Cons(double b)
	{
		System.out.println("calling double");
	}
}





public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 new Cons(10.5);
	Cons c = 	 new Cons(10);
		 new Cons("Cirlce");
		//c.Shape();
	//c.Cons("ABC");
		

	}

}
