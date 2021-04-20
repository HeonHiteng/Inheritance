//Class Student
public class Student {
	public int matric;
	public String name;
	public String email;
	private double gpa;
	

    public Student(int matric,String name,String email,double gpa) {
		this.matric=matric;
		this.name=name;
		this.email=email;
		this.gpa=gpa;
	}
    
    public Student(int matric,String name,double gpa) {
		this.matric=matric;
		this.name=name;
		this.gpa=gpa;
	}
    
    public double getGpa() {
    	return gpa;
    }
    public String toString() {
    	return "Student:"+"\nMatric: " +matric+"\nName: "+name+"\nE-mail: "+email+"\nGPA: "+getGpa();
    }
}
