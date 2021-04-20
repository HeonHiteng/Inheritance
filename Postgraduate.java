//Class Postgraduate
public class Postgraduate extends Student {
	private String thesis;
	
    public Postgraduate(int matric,String name,double gpa,String thesis) {
    	super(matric,name,gpa);
    	this.thesis=thesis;
	}
    
    public String getThesis() {
    	return thesis;
    }
	
    public void setThesis(String thesis) {
		this.thesis=thesis;
    }
    
    public String toString() {
    	return "\nPostgraduate Student:"+"\nMatric: " +matric+"\nName: "+name+"\nGPA: "+getGpa()+"\nThesis: "+getThesis();
    }

}
