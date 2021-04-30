public class User {
	int id;
	String firstName;
	String lastName;
	String nationalIdentity;
	boolean student;
	
	public User(){
		
	}
	public User(String firstName, String lastName, String nationalIdentity, boolean student) {
		this.firstName = firstName;
		this.lastName=lastName;
		this.nationalIdentity=nationalIdentity;
		this.student=student;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public boolean isStudent() {
		return student;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}
	

}
