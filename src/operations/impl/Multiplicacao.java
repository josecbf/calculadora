package operations.impl;

import operations.IOperacao;

public class Multiplicacao implements IOperacao {

	@Override
	public Integer operation(Integer a, Integer b, Integer c) {
		return a * b;
	}

}
