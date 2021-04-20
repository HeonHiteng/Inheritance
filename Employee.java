//Class Employee
public class Employee extends Person{
	private String num;
	private double basic;
	
	public Employee() {
		
	}

	public Employee(String name,String num,double basic) {
		super(name);
		this.num = num;
		this.basic = basic;
	}
	
	public String getNum() {
		return num;
	}
	
	public double getBasic() {
		return basic;
	}
    
    //Class Secretary
    class Secretary extends Employee{
	}
}
