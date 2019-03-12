package operations.impl;

import java.util.ArrayList;
import java.util.List;

import operations.IOperacao;

public class RaizQuadradaSegundoGrau implements IOperacao {

	@Override
	public List<Double> operation(Integer a, Integer b, Integer c) {
		List<Double> list = new ArrayList<>();
		list.add((-b + Math.sqrt(c)) / (2 * a));
		list.add((-b - Math.sqrt(c)) / (2 * a));
		return list;
	}
	
}
