package com.navneet.blog.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.navneet.blog.entities.User;


public interface UserRepo extends JpaRepository<User, Integer>{
	

}
