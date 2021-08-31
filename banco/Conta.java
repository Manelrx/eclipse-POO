package banco;
import programa.CriarConta;

public abstract  class Conta {
	CriarConta verifica;
	protected Cliente titular;
	protected int numConta = 0;
	protected double saldo;
	private Conta enviar;
	
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
	
	public Conta EncontraConta(String num) {	
		int numConta = Integer.parseInt(num);
		Conta enviar;
		for (int i = 0; i < verifica.contas.size(); i++) {
			if(numConta == verifica.contas.get(i).numConta) {
				this.enviar = verifica.contas.get(i);
			}else {
				this.enviar = null;
			}
		} return this.enviar;
	}
		
	
}
