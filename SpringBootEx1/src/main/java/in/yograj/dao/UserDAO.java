package in.yograj.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    UserDAO(){
        System.out.println("UserDAO Bean Created!");
    }
}
