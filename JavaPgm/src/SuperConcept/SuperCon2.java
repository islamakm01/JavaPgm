package SuperConcept;

class Animal1{
	
	Animal1(){
	
		System.out.println("I am Animal Constructor");
	}
	
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal1{

	Dog () {
		
		super();
		
		System.out.println("I am a dog consructor");
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a dog");
	}
	
	public void printMessage() {
		display();
		
		super.display();
	}
	
}


public class SuperCon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		
		dog.printMessage();
		
		

	}

}
