package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numConta, String nomeTitular, String cpfTitular, double saldo) {
		super(numConta, cpfTitular, nomeTitular, saldo);
		this.numConta = numConta;
		this.saldo = saldo;
		this.titular = new Cliente(nomeTitular, cpfTitular);
		reajustar(1.10);
	}

	public void reajustar(double percentual) {
		saldo = saldo + (saldo * percentual);
	}

	@Override
	public void ImprimirTipoConta() {
		System.out.println("Conta Poupança");
	}

	@Override
	public boolean sacar(double valor) {
		if (this.getSaldo() >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}
