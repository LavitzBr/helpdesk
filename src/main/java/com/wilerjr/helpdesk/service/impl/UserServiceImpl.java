package com.wilerjr.helpdesk.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wilerjr.helpdesk.api.entity.User;
import com.wilerjr.helpdesk.api.repository.UserRepository;
import com.wilerjr.helpdesk.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public Optional<User> findById(String id) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(id);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
	}

	@Override
	public Page<User> findAll(int page, int count) {
		// TODO Auto-generated method stub
		Pageable pages = PageRequest.of(page, count);
		return this.userRepository.findAll(pages);
	}

}
