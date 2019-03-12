package operations.impl;

import operations.IOperacao;

public class Soma implements IOperacao {

	@Override
	public Integer operation(Integer a, Integer b, Integer c) {
		return a + b;
	}

}
