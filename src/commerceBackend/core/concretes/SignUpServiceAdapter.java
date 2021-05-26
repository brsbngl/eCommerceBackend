package commerceBackend.core.concretes;

import commerceBackend.core.abstracts.SignUpService;
import commerceBackend.googleservice.GoogleRegisterManager;

public class SignUpServiceAdapter implements SignUpService{

	@Override
	public void signUpWithAnotherAccount(String email, String password) {
		
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.signUp(email, password);
	}

}
