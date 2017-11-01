package edu.mum.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.repository.AdviceRepository;
import edu.mum.service.AdviceService;

@Service
public class AdviceServiceImpl implements AdviceService{

	@Autowired
	AdviceRepository adviceRepository;
	
	@Override
	public List<String> getListByType(String type) {
		return adviceRepository.getListByType(type);
	}

	@Override
	public Map<Integer, String> getAllRoasts() {
		return adviceRepository.getAllRoasts();
	}

	@Override
	public String getRoast(Integer integer) {
		return adviceRepository.getRoast(integer);
	}

}
