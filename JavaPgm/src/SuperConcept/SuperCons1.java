package SuperConcept;

class Superclass {
	public void printMethod() {
		System.out.println("Printed in Superclass.");
	}
}

class Subclass extends Superclass{
	public void printMethod() {
		super.printMethod();
		System.out.println("Printed in Subclass");
	}
}


public class SuperCons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subclass s = new Subclass();
		s.printMethod();
		
		
	}

}
