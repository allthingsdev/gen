package mg.odg.gen.auth.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mg.odg.gen.main.exception.UserNotFoundException;
import mg.odg.gen.auth.model.User;
import mg.odg.gen.auth.repository.UserRepository;


@Service
public class AuthServiceImpl implements AuthService {

	@Resource
    private UserRepository userRepository;
 
    @Override
    @Transactional
    public User create(User user) {
        User createdUser = user;
        return userRepository.save(createdUser);
    }
     
    @Override
    @Transactional
    public User findById(int user_id) {
        return userRepository.findById(user_id).orElse(null);
    }
 
    @Override
    @Transactional
    public User delete(int user_id) throws UserNotFoundException {
        User deletedUser = userRepository.findById(user_id).orElse(null);
         
        if (deletedUser == null)
            throw new UserNotFoundException("User Not Found " + user_id);
         
        userRepository.delete(deletedUser);
        return deletedUser;
    }
 
    @Override
    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }
 
    @Override
    @Transactional(rollbackFor=UserNotFoundException.class)
    public User update(User user) throws UserNotFoundException {
    	User updatedUser = userRepository.findById(user.getUserId()).orElse(null);
         
        if (updatedUser == null)
            throw new UserNotFoundException("User Not Found");
        
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setUserName(user.getUserName());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setUpdatedOn(user.getUpdatedOn());
        
        return updatedUser;
    }
}
