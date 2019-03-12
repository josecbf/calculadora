package operations.impl;

import operations.IOperacao;

public class Potenciacao implements IOperacao {

	@Override
	public Double operation(Integer a, Integer b, Integer c) {
		return Math.pow(new Double(a), new Double(b));
	}
	

}
