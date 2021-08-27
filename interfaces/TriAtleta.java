package interfaces;

public class TriAtleta extends Pessoa implements Nadador, Corredor, Ciclista{

	public TriAtleta(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void aquecer() {
		System.out.println(this.getNome() + " est� aquecendo");
	}

	@Override
	public void correDeBicicleta() {
		System.out.println(this.getNome() + " est� pedalando");
	}

	@Override
	public void correr() {
		System.out.println(this.getNome() + " est� correndo");
	}

	@Override
	public void nadar() {
		System.out.println(this.getNome() + " est� nadando");
	}

}
