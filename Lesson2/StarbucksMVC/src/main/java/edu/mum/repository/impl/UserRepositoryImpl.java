package edu.mum.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.mum.data.Database;
import edu.mum.domain.User;
import edu.mum.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	Database database;
	
	@Override
	public List<User> getAll() {
		return (List<User>) database.getUsers().values();
	}

	@Override
	public User findByName(String name) {
		return database.getUsers().get(name);
	}

}
