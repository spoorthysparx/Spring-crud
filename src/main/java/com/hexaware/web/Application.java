package com.hexaware.web;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.web.Entities.User;
import com.hexaware.web.UserRepo.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Application.class, args);
		
		
		
//		Iterable<User> user = rep.findAll();
//		user.forEach((temp)->System.out.println(temp.toString()));
		
		UserRepository repo=	context.getBean(UserRepository.class);
		
//		Optional <User> u = repo.findById(100);
//		
//		System.out.println(u);
//		if(u.isPresent())
//		{
//			repo.deleteById(100);
// 
//			
//		}
//		else
//		{
//			System.out.println("Not Found");
//		}
//		
		
		Optional <User> u = repo.findById(100);
		
		System.out.println(u);
		if(u.isPresent())
		{
			User temp = u.get();
			temp.setName("ramya");
			repo.save(temp);
 
			
		}
		else
		{
			System.out.println("Not Found");
		}
		
//		User user1= new User();
//		user1.setUserId(200);
//		user1.setName("karthick");
//		
//		user1.setFee(18000.9);
//		repo.save(user1);
		
		
	}
}
