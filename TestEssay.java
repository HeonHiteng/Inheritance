
public class TestEssay {
	public static void main(String[] args) {

		Essay essay = new Essay();

		essay.setScore(25,18,20,25);

		System.out.println("Grammar: "+essay.getGrammer());
		System.out.println("Spelling: "+essay.getSpelling());
		System.out.println("Correct Length: "+essay.getCorrectLength());
		System.out.println("Content: "+essay.getContent());
		System.out.println("Total Score: "+essay.getScore());
		System.out.println("Grade: "+essay.getGrade());

		}
}
