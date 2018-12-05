package mg.odg.gen.auth.service;

import java.util.List;

import mg.odg.gen.main.exception.UserNotFoundException;
import mg.odg.gen.auth.model.User;

public interface AuthService {

	public User create(User User);
    public User update(User User) throws UserNotFoundException;
    public User delete(int id) throws UserNotFoundException;
    public List<User> findAll();
    public User findById(int id);
}
