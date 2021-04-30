public class Main {

	public static void main(String[] args) {
		
		Student std =new Student();
		std.setId(0);
		std.setFirstName("Ahmet Berke");
		std.setLastName("Tekerci");
		std.setNationalIdentity("01234567891");
		std.setOverallYearAverage(85.9);
		std.setStudent(true);
		
		Instructor ist =new Instructor();
		ist.setId(1);
		ist.setFirstName("Engin");
		ist.setLastName("Demirog");
		ist.setNationalIdentity("12345678901");
		ist.setDepartment("Yazýlým");
		ist.setStudent(false);
		
		StudentManager stdmngr =new StudentManager();
		stdmngr.add(std);
		
		
		InstructorManager istmngr =new InstructorManager();
		istmngr.add(ist);
	}

}
