package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import operations.impl.Divisao;
import operations.impl.Multiplicacao;
import operations.impl.Potenciacao;
import operations.impl.RaizQuadrada;
import operations.impl.RaizQuadradaSegundoGrau;
import operations.impl.Soma;
import operations.impl.Subtracao;

public class Calculadora {
	
	private static final String RAIZ = "segundo";

	public void start() throws Exception {
		int op;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite a op��o desejada");
			System.out.println("1 - Soma");
			System.out.println("2 - Substra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Potencia��o");
			System.out.println("6 - Ra�z quadrada");
			System.out.println("7 - Equa��o do segundo grau");
			System.out.println("0 - para sair...");
			op = selectMetod(scan.nextInt());
			scan.close();
		} while (op != 0);
		
	}
	
	private Integer selectMetod(Integer option) throws Exception {
		List<Integer> list = new ArrayList<>();
		
		switch (option) {
			case 1:
				list = getNumbers("soma");
				Soma soma = new Soma();
				showResult("soma", soma.operation(list.get(0), list.get(1), null));
				break;
			case 2:
				list = getNumbers("subtra��o");
				Subtracao sub = new Subtracao();
				showResult("subtra��o", sub.operation(list.get(0), list.get(1), null));
				break;
			case 3:
				list = getNumbers("multiplica��o");
				Multiplicacao mult = new Multiplicacao();
				showResult("multiplica��o", mult.operation(list.get(0), list.get(1), null));
				break;
			case 4:
				list = getNumbers("divis�o");
				Divisao div = new Divisao();
				showResult("divis�o", div.operation(list.get(0), list.get(1), null));
				break;
			case 5:
				list = getNumbers("potencia��o");
				Potenciacao pot = new Potenciacao();
				showResult("potencia��o", pot.operation(list.get(0), list.get(1), null));
				break;
			case 6:
				list = getNumbers("raiz quadrada");
				RaizQuadrada rq = new RaizQuadrada();
				showResult("raiz quadrada", rq.operation(list.get(0), null, null));
				break;
			case 7:
				list = getNumbers("raiz de segundo grau");
				RaizQuadradaSegundoGrau rqsg = new RaizQuadradaSegundoGrau();
				showResult("", rqsg.operation(list.get(0), list.get(1), list.get(2)));
				break;
			case 0:
				break;
			default:
				throw new Exception("Valor inv�lido");
		}
		
		return option;
	}
	
	public List<Integer> getNumbers(String m) {
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero para realizar a " + m + ": ");
		list.add(scan.nextInt());
		
		if (!m.contains("quadrada")) {
			System.out.println("Digite o segundo n�mero para realizar a " + m + ": ");
			list.add(scan.nextInt());
			
			if (m.contains(RAIZ)) {
				System.out.println("Digite o terceiro n�mero para realizar a " + m + ": ");
				list.add(scan.nextInt());
			}
		}
		
		scan.close();
		return list;
	}
	
	public void showResult(String m, Object result) {
		if (result instanceof List) {
			List<Double> list = cast(result);
			System.out.println("Resultado da " + m + " �: ");
			System.out.println("x1: " + list.get(0));
			System.out.println("x2: " + list.get(1));
		} else {
			System.out.println("Resultado da " + m + " �: " + result);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends List<?>> T cast(Object obj) {
	    return (T) obj;
	}
}
