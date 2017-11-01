package edu.mum.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import edu.mum.domain.User;

@Component
public class Database {
	private static HashMap<String, User> users = new HashMap<>();
	private static HashMap<String, List<String>> advice = new HashMap<String, List<String>>();
	static {
		users.put("Dave", new User("Dave", "111"));
		users.put("Steve", new User("Steve", "222"));
		users.put("Ralph", new User("Ralph", "333"));
		ArrayList<String> darkList = new ArrayList<String>();
		darkList.add("Sumatra");
		darkList.add("Verona");
		darkList.add("French Roast");
		advice.put("dark", darkList);
		ArrayList<String> medList = new ArrayList<String>();
		medList.add("Breakfast Blend");
		medList.add("Colombia");
		medList.add("Yukon");
		medList.add("Pike Place");
		medList.add("House Blend");
		advice.put("medium", medList);
		ArrayList<String> lightList = new ArrayList<String>();
		lightList.add("Willow");
		lightList.add("Aria");
		lightList.add("Bright Sky");
		lightList.add("Veranda");
		advice.put("light", lightList);
	}

	public List<String> getAdvice(String roast) {
		return advice.get(roast);
	}

	public Map<String, User> getUsers() {
		return users;
	}

	public Map<Integer, String> roasts = new HashMap<Integer, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(1, "dark");
			put(2, "medium");
			put(3, "light");
		}
	};

}
