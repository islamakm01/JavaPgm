
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * int i = 1 --- initlaization
		 * i<=10 --- condition  if conditin is true loop will continue and if condition is fail - it will break
		 * 
		 * i++ -- increment 
		 * 
		 */
		
		for(int i = 1 ; i<=10 ;i++) // 11  11<=10 11
		{
			System.out.println(i);
		}
		
		// ODD number
		
		//1 3 5 7 9 11
		
		//2 4 6 8 10
		
		for(int i = 2 ; i<=20 ; i=i+2)
		{
			System.out.println(i);
		}
		       //   0123456
		String s = "testingyfdsgfkjdhfkjdhfdshf";
		
		System.out.println(s.length());
		
		for(int i = 0 ; i<s.length() ; i++)  // 1  1<=6 1
		{
			System.out.println(s.charAt(i));  //"Testing".charat(1)
		}
		
		//Print Reverese String 
		//print Prime Number and check it is prime or not
		//Work on Fabinoci series in java --- 0 1 1 2 3 5 7

	}

}
