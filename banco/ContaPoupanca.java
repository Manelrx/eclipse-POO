package banco;

public class ContaPoupanca extends Conta implements Investimento{

	public ContaPoupanca(int numConta, String nomeTitular, String cpfTitular, double saldo) {
		super(numConta, cpfTitular, nomeTitular, saldo);
		this.numConta = numConta;
		reajuste(saldo);
		this.titular = new Cliente(nomeTitular, cpfTitular);
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

	@Override
	public void reajuste(double saldo) {
		this.saldo += saldo * 0.5;
	}
}
