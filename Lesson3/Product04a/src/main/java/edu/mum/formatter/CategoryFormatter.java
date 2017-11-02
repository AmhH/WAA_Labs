package edu.mum.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import edu.mum.domain.Category;

public class CategoryFormatter implements Formatter<Category>{

	@Override
	public String print(Category object, Locale locale) {
		return null;
	}

	@Override
	public Category parse(String text, Locale locale) throws ParseException {
		return null;
	}

}
