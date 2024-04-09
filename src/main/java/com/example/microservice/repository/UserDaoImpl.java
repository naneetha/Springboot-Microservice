package com.example.microservice.repository;

import org.springframework.stereotype.Repository;
import com.example.microservice.model.user;
@Repository
public class UserDaoImpl implements UserDao{

   
    @Autowired
    private RedisTemplate redisTemplate;

    private static final String KEY = "USER";

    @Override
    public boolean saveUser(User user){
        try{
            redisTemplate.opsForHash().put(KEY, user.getId().toString(), user);
            return true;
        } catch(Exception ex){
             ex.printStackTrace();
             return false;
        }
    }
}