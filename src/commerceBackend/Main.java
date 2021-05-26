package commerceBackend;
import commerceBackend.business.concretes.UsersManager;
import commerceBackend.core.concretes.SignUpServiceAdapter;
import commerceBackend.dataAccess.concretes.HibernateUsersDao;
import commerceBackend.entites.concretes.Users;
public class Main {

	public static void main(String[] args) {
		Users user1 = new Users(1, "Baris", "Bingol", "brs.bngl@hotmail.com", "12343445");
		Users user2 = new Users(2, "Engin", "Demirog", "engin@gmail.com", "123456");
		Users user3 = new Users(3,"Admin","Bey","admin@gmail.com","123456789");
			
		UsersManager userManager = new UsersManager(new HibernateUsersDao());
			
		userManager.signUp(user1);
		userManager.signUp(user2);
		userManager.signUp(user3);
		
			
		userManager.login("yeni.uye@gmail.com","2340234567");
			 
		userManager.signUpWithAnotherService("yeni.uye1@gmail.com","12346703",new SignUpServiceAdapter());
		
	
		

	}

}
