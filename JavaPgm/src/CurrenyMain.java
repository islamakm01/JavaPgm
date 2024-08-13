
class Currency {
	
	public void type() {
		System.out.println("Currency Name: ");
	}
}

class India extends Currency{
		
	public void name() {
		System.out.println("India Ruppee");
	}
}	
class Bangladesh extends Currency{
		
		public void name() {
			System.out.println("Bangladesh Taka");
		}
}		
class USA extends Currency{
			
			public void name() {
				System.out.println("USA Dollar");
			}
}
class England extends Currency{
	
	public void name() {
		System.out.println("England Pound");
	}			
			
}
public class CurrenyMain {

	public static void main(String[] args) {
		
		
		India india = new India();
		india.type();
		india.name();
		
		Bangladesh bd = new Bangladesh();
		bd.type();
		bd.name();
		
		USA usa = new USA();
		usa.type();
		usa.name();
	

	}

}
