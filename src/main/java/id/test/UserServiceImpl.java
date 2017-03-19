package id.test;

import org.springframework.stereotype.Service;

/**
 * Created by WaroenglordZ on 19/03/2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String printHello() {
        return "Hello World";

    }

    @Override
    public Boolean validateUser(Integer age) {
        if(age > 17) return  true;
        else return false;
    }
}
