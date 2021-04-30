
public class StudentManager {
	public void add(Student student) {
		System.out.println("Öğrenci id:"+student.id);
		System.out.println("Öğrenci eklendi: "+student.getFirstName() + " " + student.getLastName() + " Ortalaması:"+student.overallYearAverage);
		
	}
}
