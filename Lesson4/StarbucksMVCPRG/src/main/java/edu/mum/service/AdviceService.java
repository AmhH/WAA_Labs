package edu.mum.service;

import java.util.List;
import java.util.Map;

public interface AdviceService {
	public List<String> getListByType(String type);
	public Map<Integer, String> getAllRoasts();
	public String getRoast(Integer integer);
}
