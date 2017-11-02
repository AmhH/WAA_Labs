package edu.mum.repository;

import java.util.List;

import edu.mum.domain.User;

public interface UserRepository {
	public List<User> getAll();
	public User findByName(String name);
}
