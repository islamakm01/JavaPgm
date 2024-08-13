package SuperConcept;

class Student
{
	String Name ;
	int Id ; 
	int PNo;
	
	Student(String Name , int Id , int PNo)
	{
		this.Name = Name;
		this.Id=Id;
		this.PNo = PNo;
				
	}
	
	
	public void getDetails()
	{
		System.out.println(Name+" "+Id+" "+PNo);
	}
}

public class ThisConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("ABC", 001 , 1234);
		s.getDetails();
		

	}

}
