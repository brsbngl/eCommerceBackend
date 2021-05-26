package commerceBackend.business.abstracts;

public interface AuthService {
	boolean checkFirstLastName(String firstName, String lastName);
	boolean checkMail(String email);
	boolean checkMailExist(String email);
	boolean checkPassword(String password);
	boolean userIdValid(String name, String lastName, String email, String password);
	void sendConfirmMail();

}
