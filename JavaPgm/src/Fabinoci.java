
public class Fabinoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(a + " ");
			
			int temp = a + b;
			b= a;
			a = temp;
		}

	}

}
