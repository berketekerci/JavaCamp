
public class StudentManager {
	public void add(Student student) {
		System.out.println("��renci id:"+student.id);
		System.out.println("��renci eklendi: "+student.getFirstName() + " " + student.getLastName() + " Ortalamas�:"+student.overallYearAverage);
		
	}
}
