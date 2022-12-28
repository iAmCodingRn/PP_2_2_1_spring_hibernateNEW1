package web.dao;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

   void saveUser(User user);

   void updateUser(User user);

   void deleteUser(long id);

   List<User> getAllUsers();

   Optional<User> findUserById(long id);
}