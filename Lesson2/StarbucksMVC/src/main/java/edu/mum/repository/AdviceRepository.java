package edu.mum.repository;

import java.util.List;
import java.util.Map;

public interface AdviceRepository {
	public List<String> getListByType(String type);
	public Map<Integer, String> getAllRoasts();
	public String getRoast(Integer integer);
}