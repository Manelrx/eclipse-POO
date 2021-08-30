package banco;

public abstract  class Conta {
	protected Cliente titular;
	protected int numConta;
	protected double saldo;
	
	public Conta (int numConta, String nomeTitular, String cpfTitular, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.titular = new Cliente(nomeTitular, cpfTitular);
	}
	 public Conta(String titular2, String saldo2, String limite) {
		
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public int getNumConta() {
		return numConta;
	}
	public void depositar (double saldo) {
		this.saldo += saldo;
	}
	public abstract boolean sacar(double valor);
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract void ImprimirTipoConta();
	
	public String ImprimirTipoConta(String texto) {
		return "Conta Comum "+ texto; 
	}
	
}
