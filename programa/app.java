package programa;

import java.util.ArrayList;
import java.util.Scanner;

import banco.Conta;
import banco.ContaEspecial;
import banco.ContaPoupanca;

public class app {
	public static void main(String[] args) {
		boolean parar = false;
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(3%2);
		do {
			System.out.println("Digite 1 para criar uma conta");
			System.out.println("Digite 2 para ver o saldo");
			System.out.println("Digite 3 para realizar um saque");
			System.out.println("Digite 4 para realizar um deposito");
			System.out.print("Digite 5 para finalizar o programa: ");

			int escolha = scan.nextInt();

			if (escolha == 1) {
				System.out.println("1 para Conta Especial,");
				System.out.println("2 para Conta Poupan�a, ");
//				System.out.print("3 para Conta comum: ");
				int escolhaConta = scan.nextInt();

				if (escolhaConta == 1) {
					
					System.out.print("Digite seu Nome:");
					String nomeTitular = scan.next();
					
					System.out.print("Digite seu CPF:");
					String cpfTitular = scan.next();

					System.out.print("Digite o saldo inicial:");
					double saldo = scan.nextDouble();
					
					ContaEspecial conta = new ContaEspecial((contas.size() + 1), nomeTitular, cpfTitular, saldo);

					System.out.println("Conta criada! n�mero: " + conta.getNumConta() + "\n");

					contas.add(conta);
				} else if (escolhaConta == 2) {
					
					System.out.print("Digite seu Nome:");
					String nomeTitular = scan.next();
					
					System.out.print("Digite seu CPF:");
					String cpfTitular = scan.next();

					System.out.print("Digite o saldo inicial:");
					double saldo = scan.nextDouble();
					
					ContaPoupanca conta = new ContaPoupanca((contas.size() + 1), nomeTitular, cpfTitular, saldo);
					System.out.println("Conta criada! n�mero: " + conta.getNumConta() + "\n");

					contas.add(conta);
				}
			}
			if (escolha == 2 || escolha == 3 || escolha == 4) {
				System.out.print("Informe o n�mero da conta que deseja operar: ");
				int numConta = scan.nextInt();
				for (int i = 0; contas.size() > i; i++) {
					if (contas.get(i).getNumConta() == numConta) {
						Conta autentica = contas.get(i);
						autentica.ImprimirTipoConta();
						if (escolha == 2) {
							System.out.println(autentica.getTitular().getNome() + " Seu saldo � R$" + autentica.getSaldo());
						} else if (escolha == 3) {
							System.out.println("Informe o valor que deseja sacar: ");
							boolean verifica = autentica.sacar(scan.nextDouble());
							if (verifica == true) {
								System.out.println(autentica.getTitular().getNome() + " Seu saldo � R$" + autentica.getSaldo());
							} else {
								System.out.println(autentica.getTitular().getNome() + " voc� n�o pode sacar pois seu saldo � "
										+ autentica.getSaldo());
							}
						} else if (escolha == 4) {
							System.out.print("Informe o valor que deseja depositar: ");
							contas.get(i).depositar(scan.nextDouble());
							System.out.println(autentica.getTitular().getNome() + " Seu saldo � R$" + contas.get(i).getSaldo());
						}
					}
				}

			} else if (escolha == 5) {
				parar = true;
				System.out.println("Foi um prazer, at� a proxima");
			} else if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5) {
				System.out.println("Essa op��o n�o existe");
			}
		} while (parar == false);
		scan.close();
	}
}
