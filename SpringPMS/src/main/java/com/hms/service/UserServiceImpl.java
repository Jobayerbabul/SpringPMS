package com.hms.service;
import com.hms.model.User;
import com.hms.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;  // Here 'userRepo' is an object of the class 'UserRepo'.

//    @Transactional
//    public User createUser(User user) {
//        try {
//            return userRepo.save(user);
//        } catch (DataIntegrityViolationException e) {
//            // Handle the exception and provide a meaningful message
//            throw new UserAlreadyExistsException("Username or phone number already exists.");
//        }
//    }

    @Override
    public User saveUser(User user) { return userRepo.save(user); }

    @Override
    public List<User> fetchUserList() {
        return userRepo.findAll();
    }

    @Override
    public User fetchUserById(int userId) {
        return userRepo.findById(userId).get();
    }

    @Override
    public void deleteById(int userId) { userRepo.deleteById(userId);}

    @Override
    public User updateUserById(int userId, User user) {
        User updateUserDB = userRepo.findById(userId).get();

        if (Objects.nonNull(user.getUserName()) && !"".equalsIgnoreCase(user.getUserName())) {
            updateUserDB.setUserName(user.getUserName());
        }
        if (Objects.nonNull(user.getUserType()) && !"".equalsIgnoreCase(user.getUserType())) {
            updateUserDB.setUserType(user.getUserType());
        }
        if (Objects.nonNull(user.getFullName()) && !"".equalsIgnoreCase(user.getFullName())) {
            updateUserDB.setFullName(user.getFullName());
        }
        if (Objects.nonNull(user.getPhone()) && !"".equalsIgnoreCase(user.getPhone())) {
            updateUserDB.setPhone(user.getPhone());
        }
        if (Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())) {
            updateUserDB.setPassword(user.getPassword());
        }
        if (Objects.nonNull(user.getSex()) && !"".equalsIgnoreCase(String.valueOf(user.getSex()))) {
            updateUserDB.setSex(user.getSex());
        }
        if (Objects.nonNull(user.getDob()) && !"".equalsIgnoreCase(String.valueOf(user.getDob()))) {
            updateUserDB.setDob(user.getDob());
        }

        if (Objects.nonNull(user.getAddress()) && !"".equalsIgnoreCase(user.getAddress())) {
            updateUserDB.setAddress(user.getAddress());
        }

        return userRepo.save(updateUserDB);

    }

}
