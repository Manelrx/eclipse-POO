package faculdade;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe quantos n�meros deseja: ");
		int quantNumeros = scan.nextInt();

		for (int i = 0; i < quantNumeros; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " � par, ");
			} else {
				System.out.print(i + " � impar, ");
			}
		}

		scan.close();
	}

}
