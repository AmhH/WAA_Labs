package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.User;
import edu.mum.repository.UserRepository;
import edu.mum.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.getAll();
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

}
