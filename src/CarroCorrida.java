
public abstract class CarroCorrida {

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroCorrida(String nome, int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}
	
	protected abstract void acelerar();

	protected void frear() {
		velocidade = velocidade / 2;
	}

	protected int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}

}
