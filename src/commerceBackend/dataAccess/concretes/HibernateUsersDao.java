package commerceBackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import commerceBackend.dataAccess.abstracts.UsersDao;
import commerceBackend.entites.concretes.Users;

public class HibernateUsersDao implements UsersDao{
	List<Users>users = new ArrayList<Users>();

	@Override
	public void add(Users user) {
		System.out.println("Hibernate ile eklendi. " + user.getFirstName());
		users.add(user);
		
		
	}

	@Override
	public void update(Users user) {
		System.out.println("Hibarnate ile güncellendi. " + user.getFirstName());
		
	}

	@Override
	public void delete(Users user) {
		System.out.println("Hibernate ile silindi." + user.getFirstName());
	
		
	}

	@Override
	public Users getUsers(String email, String password) {
		Users loginUsers = null;
		for(Users user: users)
		{
			if(user.getEmail()==email && user.getPassword()==password)
			{
				loginUsers = user;
			}
		}
		
		return loginUsers;
	}

	@Override
	public boolean getEmail(String email) {
	
		return true;
	}

	@Override
	public List<Users> getAllUsers() {
		
		return users;
	}

}
