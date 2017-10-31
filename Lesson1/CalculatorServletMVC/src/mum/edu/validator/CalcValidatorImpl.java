package mum.edu.validator;

import java.util.ArrayList;
import java.util.List;

import mum.edu.domain.Calculator;

public class CalcValidatorImpl implements CalcValidator {

	@Override
	public List<String> validate(Object object) {
		List<String> errors = new ArrayList<>();
		Calculator calculator = (Calculator) object;
		if (calculator.getAdd1() == null) {
			errors.add("Add1 operands must have a value");
		}
		if (calculator.getAdd1() == null) {
			errors.add("Add2 operands must have a value");
		}
		if (calculator.getAdd1() == null) {
			errors.add("Multiply1 operands must have a value");
		}
		if (calculator.getAdd1() == null) {
			errors.add("Multiply2 operands must have a value");
		}
		return errors;
	}

}
