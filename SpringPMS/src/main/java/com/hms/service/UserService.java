
package com.hms.service;

import com.hms.model.User;
import java.util.List;

public interface UserService {
//    public User createUser(User user);
    public User saveUser(User user);

    public List<User> fetchUserList();

    public User fetchUserById(int userId);

    public void deleteById(int userId);

    public User updateUserById(int userId, User user);
}
