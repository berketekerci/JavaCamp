
public class UserManager {
	public void addUser(User user) {

		if (user.isStudent()==true) {
			
			System.out.println("Adý Soyadý:"+user.getFirstName()+" "+user.getLastName()+ "Öðrenci" );
			
		}else {
			System.out.println("Adý Soyadý:"+user.getFirstName()+" "+user.getLastName()+ "Eðitmen" );
		}
		
	
	}
}