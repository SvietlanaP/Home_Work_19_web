package servlet;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStorage {
    List<User> userList = new ArrayList<>();

    public String addUser(User user){
        String answer;
        if (isUserExist(user)){
            answer = "Такой пользователь уже есть.";
        } else {
            userList.add(user);
            answer ="Пользователь внесен в базу.";
        }

        return answer;
    }

   private boolean isUserExist(User user){
       return userList.contains(user);
   }
}
