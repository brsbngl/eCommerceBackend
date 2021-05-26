package commerceBackend.business.concretes;

import java.util.List;

import commerceBackend.business.abstracts.UsersService;
import commerceBackend.core.abstracts.SignUpService;
import commerceBackend.dataAccess.abstracts.UsersDao;
import commerceBackend.entites.concretes.Users;

public class UsersManager implements UsersService {
	
	private UsersDao usersDao;
	
	public UsersManager(UsersDao usersDao) {
		
		super();
		this.usersDao = usersDao;
	}
	
	AuthManager authManager = new AuthManager();
	

	@Override
	public void signUp(Users user) {
		
		if(authManager.userIdValid(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword())) {
			
			usersDao.add(user);
			authManager.sendConfirmMail();
		}
	}

	@Override
	public void signUpWithAnotherService(String email, String password, SignUpService signUpService) {
		signUpService.signUpWithAnotherAccount(email, password);
		authManager.sendConfirmMail();
	
		
	}

	@Override
	public void login(String email, String password) {
		if(usersDao.getUsers(email, password)!=null){
			System.out.println("Giris Basariyla Yapildi.");
		}else {
			System.out.println("Para veya Sifre hatali girildi.");
		}
		
	}

	@Override
	public List<Users> getAll() {
		
		return usersDao.getAllUsers();
	}

}
