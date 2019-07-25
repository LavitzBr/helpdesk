package com.wilerjr.helpdesk.api.repository;

import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.wilerjr.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByEmail(String email);
	
}
