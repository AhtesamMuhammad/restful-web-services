package com.ahtesam.rest.webservice.restfulwebservices.user;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int userCount = 0; 

    static {
        users.add(new User(++userCount,"Ahtesam",LocalDate.now().minusYears(25)));
        users.add(new User(++userCount,"Pablo",LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Miguel",LocalDate.now().minusYears(40)));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }
    
    public User findOne(int id){
        Predicate<? super User> predicate = user -> 
            user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
