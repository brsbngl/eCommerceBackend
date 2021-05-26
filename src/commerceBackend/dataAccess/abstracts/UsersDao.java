package commerceBackend.dataAccess.abstracts;

import java.util.List;

import commerceBackend.entites.concretes.Users;

public interface UsersDao {
	
	void add(Users user);
	void update(Users user);
	void delete(Users user);
	Users getUsers(String email, String password);
	boolean getEmail(String email);
	List<Users>getAllUsers();

}
