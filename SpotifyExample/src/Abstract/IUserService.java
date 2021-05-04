package Abstract;

import Entities.Users;

public interface IUserService {
	void Add(Users users);
	void Delete(Users users);
	void Update(Users users);
}
