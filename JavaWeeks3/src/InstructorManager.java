
public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("Eðitmen id:"+instructor.id);
		System.out.println("Eðitmen eklendi: "+instructor.getFirstName() + " " + instructor.getLastName() + " Bölümü: "+instructor.department);
	}
}
