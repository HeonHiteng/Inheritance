//Class person
public class Person {
	private String name;
	private String address;
	private double phone;
	private String email;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name,String address,int phone,String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
}
