package edu.mum.repository.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.mum.data.Database;
import edu.mum.repository.AdviceRepository;

@Repository
public class AdviceRepositoryImpl implements AdviceRepository {

	@Autowired
	Database database;
	
	@Override
	public List<String> getListByType(String type) {
		return database.getAdvice(type);
	}

	@Override
	public Map<Integer, String> getAllRoasts() {
		return database.roasts;
	}

	@Override
	public String getRoast(Integer integer) {
		return database.roasts.get(integer);
	}

}
