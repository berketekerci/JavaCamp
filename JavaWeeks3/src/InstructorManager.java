
public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("E�itmen id:"+instructor.id);
		System.out.println("E�itmen eklendi: "+instructor.getFirstName() + " " + instructor.getLastName() + " B�l�m�: "+instructor.department);
	}
}
