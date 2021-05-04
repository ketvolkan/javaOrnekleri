package Abstract;

import Entities.Users;

public abstract class UserService implements IUserService{
	public void Add(Users users) {
		System.out.println(users.getId()+" Eklendi...");
	}
	public void Delete(Users users) {
		System.out.println(users.getId()+" Silindi...");
	}
	public void Update(Users users) {
		System.out.println(users.getId()+" Güncellendi...");
	}
}
