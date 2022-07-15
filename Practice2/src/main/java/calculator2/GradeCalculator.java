package calculator2;

public class GradeCalculator implements GradeCalculatorService{

	public String getClassification(double mark) {
		if (mark < 75) {
			return "fail";
		} else if (mark >= 75 && mark < 80) {
			return "pass";
		} else if (mark >= 80 && mark < 90) {
			return "merit";
		} else {
			return "distinction";
		}
	}
}
