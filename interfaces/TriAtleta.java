package interfaces;

public class TriAtleta extends Pessoa implements Nadador, Corredor, Ciclista{

	public TriAtleta(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void aquecer() {
		System.out.println(this.getNome() + " está aquecendo");
	}

	@Override
	public void correDeBicicleta() {
		System.out.println(this.getNome() + " está pedalando");
	}

	@Override
	public void correr() {
		System.out.println(this.getNome() + " está correndo");
	}

	@Override
	public void nadar() {
		System.out.println(this.getNome() + " está nadando");
	}

}
