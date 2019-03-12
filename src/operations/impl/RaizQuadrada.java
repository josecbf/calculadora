package operations.impl;

import operations.IOperacao;

public class RaizQuadrada implements IOperacao {

	@Override
	public Double operation(Integer a, Integer b, Integer c) {
		return Math.sqrt(new Double(a));
	}
	
}
