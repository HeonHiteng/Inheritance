
public class GradeActivity {
	private double score;
	private char grade;
	
	public GradeActivity() {
	}
	
    public GradeActivity(double score) {
		this.score=score;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score=score;
	}
	
	public char getGrade() {
		   if(score>=90)
		        grade='A';
		        else if (score>=80)
		        grade='B';
		        else if(score>=70)
		        grade='C';
		        else if (score>=60)
		        grade='D';
		        else
		        grade='F';
		        
		        return grade;
	}
}
