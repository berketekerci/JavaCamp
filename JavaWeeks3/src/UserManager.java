
public class UserManager {
	public void addUser(User user) {

		if (user.isStudent()==true) {
			
			System.out.println("Ad� Soyad�:"+user.getFirstName()+" "+user.getLastName()+ "��renci" );
			
		}else {
			System.out.println("Ad� Soyad�:"+user.getFirstName()+" "+user.getLastName()+ "E�itmen" );
		}
		
	
	}
}