package faculdade;

import java.util.ArrayList;

public class NumerosPrimos {
	static ArrayList<Double> numerosPrimos = new ArrayList<Double>();
	static ArrayList<Double> numeros = new ArrayList<Double>();
	static boolean NaoEPrimo;

	public static void main(String[] args) {

		verificaPrimos(2);

		for (int i = 3; i < 2000; i++) {
			NaoEPrimo = false;
			for (int j = 0; j < numeros.size(); j++) {
				if (i == numeros.get(j)) {
					NaoEPrimo = true;
				}
			}
			if (NaoEPrimo == false) {
				verificaPrimos(i);
			}
		}
		ImprimeOsNumeros();

	}

	private static void verificaPrimos(double numero) {
		numerosPrimos.add(numero);
		for (int i = 1; i < 1000; i++) {
			double valor = numero * i;
			numeros.add(valor);
		}
	}

	private static void ImprimeOsNumeros() {
		for (int i = 0; i < numerosPrimos.size(); i++) {
			System.out.println(numerosPrimos.get(i));
		}
	}

}