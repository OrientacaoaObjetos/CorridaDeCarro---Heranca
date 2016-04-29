
public class CarroSoma extends CarroCorrida {
	
	private int potencia;
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	@Override
	protected void acelerar() {
		velocidade += potencia;
		
		if (velocidade > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}
	}
}
