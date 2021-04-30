
public class Student extends User{
	String studentNumber;
	
	public Student(){
		
	}
	public Student(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	double overallYearAverage;
	
	public double getOverallYearAverage() {
		return overallYearAverage;
	}
	public void setOverallYearAverage(double overallYearAverage) {
		this.overallYearAverage = overallYearAverage;
	}
	
}
