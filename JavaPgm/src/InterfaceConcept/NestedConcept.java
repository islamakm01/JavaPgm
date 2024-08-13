package InterfaceConcept;

class ABC
{
	public void testABC() {
		System.out.println("Test class ABC");
	}
			static class BCD
			{
				public void bcd()
				{
					System.out.println("Test class ABC BCD");
					
				}
			}
}

class CDE
{
	
	public void Image()
	{
		System.out.println("Circle");
	}
	interface DEF
	{
		public void Test2();
	}
}


interface EFG
{
	class FGH
	{
		public void Test3()
		{
			
		}
	}
}

interface GHI
{
	interface HIJ 
	{
		public void Test4();
	}
}



class Multi extends CDE implements CDE.DEF
{

	@Override
	public void Test2() {
		// TODO Auto-generated method stub
		
	}
	
}

class Test1 extends ABC.BCD {
	
}

public class NestedConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multi m = new Multi();
		m.Image();
		m.Test2();
		
		Test1 test1 = new Test1();
		
		test1.bcd();
		
		
		
		

	}

}
