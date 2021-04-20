//Class Undergraduate
public class Undergraduate extends Student {

	private String classification;
	
    public Undergraduate(int matric,String name,double gpa,String classification) {
    	super(matric,name,gpa);
    	this.classification=classification;
	}
    
    public String getClassification() {
    	return classification;
    }
	
    public void setClassification(String classification) {
		this.classification=classification;
    }
    
    public String toString() {
    	return "\nUndergraduate Student:"+"\nMatric: " +matric+"\nName: "+name+"\nGPA: "+getGpa()+"\nClassification: "+getClassification();
    }
}
