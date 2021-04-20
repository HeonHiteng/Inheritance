//Test class
public class TestStudent {

	public static void main(String[] args) {
		
		//Create student
		Student s1 = new Student(123444,"Ali Ahmad","ali@gmail.com",3.75);
		Undergraduate s2 = new Undergraduate(123446,"Syahida Said",3.00,"Junior");
		Postgraduate s3 = new Postgraduate(123555,"Muhammad Aiman Basir",3.57,"Cancer Prognosis");
		
		//Display output
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}

}
