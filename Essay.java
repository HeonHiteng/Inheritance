
public class Essay extends GradeActivity {
	private double grammer;
	private double spelling;
	private double correctLength;
	private double content;
	
	public Essay() {
		
	}
	
    public double getGrammer() {
    	return grammer;
    	}

    public double getSpelling() {
    	return spelling;
    	}

    public double getCorrectLength() {
    	return correctLength;
    	}

    public double getContent() {
    	return content;
    	}
	
    private void setGrammer(double grammer) {
    	if(grammer >=0 && grammer <=30)
    	this.grammer = grammer;
    	else
    	this.grammer = 0;
    	}

    	private void setSpelling(double spelling) {
    	if(spelling >=0 && spelling <=20)
    	this.spelling = spelling;
    	else
    	this.spelling = 0;
    	}

    	private void setCorrectLength(double correctLength) {
    	if(correctLength >=0 && correctLength <=20)
    	this.correctLength = correctLength;
    	else
    	this.correctLength = 0;
    	}

    	private void setContent(double content) {
    	if(content >=0 && content <=30)
    	this.content = content;
    	else
    	this.content = 0;
    	}

    	public void setScore(double grammer,double spelling, double correctLength, double content) {
    	setGrammer(grammer);
    	setSpelling(spelling);
    	setCorrectLength(correctLength);
    	setContent(content);
    	super.setScore(getGrammer() + getSpelling() + getCorrectLength() + getContent());

    	}

    	public double getScore() {
    	return super.getScore();
    	}

    	
	
}
