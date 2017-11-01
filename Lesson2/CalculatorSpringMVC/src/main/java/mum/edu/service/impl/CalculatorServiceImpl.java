package mum.edu.service.impl;

import org.springframework.stereotype.Service;

import mum.edu.domain.Calculator;
import mum.edu.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public void add(Calculator calculator) {
		calculator.add();
	}

	@Override
	public void mult(Calculator calculator) {
		calculator.mult();
	}

}
