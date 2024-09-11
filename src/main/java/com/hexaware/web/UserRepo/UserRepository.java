package com.hexaware.web.UserRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.web.Entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
