package banco;

public class ContaEspecial extends Conta {
	private double limite;
	public ContaEspecial(int numConta, String nomeTitular, String cpfTitular, double saldo) {
		super(numConta, nomeTitular, cpfTitular, saldo);
		this.numConta = numConta;
		this.saldo = saldo;
		this.titular = new Cliente(nomeTitular, cpfTitular);
		this.limite = 200;
	}
	
	public ContaEspecial(String titular,String saldo, String limite) {
		super(titular, saldo, limite);
		this.numConta = numConta + 1;
		this.titular.setNome(titular);
		this.saldo = Double.parseDouble(saldo);
		this.limite = Double.parseDouble(limite);
		
	}

	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public void ImprimirTipoConta() {
		System.out.println("Conta Especial");
	}
	@Override
	public boolean sacar(double valor) {
		if (valor <= (this.saldo + this.limite)) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
}
