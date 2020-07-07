package Dao;

import entity.Login;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User("long","123456","long","long@gmail.com",18));
        users.add(new User("an","123456","an","an@gmail.com",19));
    }

    public static User checkLogin(Login login){
        for (User user : users){
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
