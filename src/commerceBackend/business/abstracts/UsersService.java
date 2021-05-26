package commerceBackend.business.abstracts;

import java.util.List;

import commerceBackend.core.abstracts.SignUpService;
import commerceBackend.entites.concretes.Users;

public interface UsersService {
	void signUp(Users user);
	void signUpWithAnotherService(String email, String password, SignUpService signUpService);
	void login(String email, String password);
	List<Users>getAll();

}
