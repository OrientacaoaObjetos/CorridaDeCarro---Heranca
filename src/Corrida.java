import java.util.HashMap;
import java.util.Map;

public class Corrida {
	
	private int pista;
	private Map<CarroCorrida, Integer> carros = new HashMap<>();
	
	public Corrida(int tamanhoCorrida) {
		this.pista = tamanhoCorrida;
	}
	
	public void adicionaCarro(CarroCorrida carro) {
		carros.put(carro, 0);
	}
	
	private boolean terminou() {
		for (Integer valor : carros.values()) {
			if (valor > pista){
				return true;
			}
		}
		
		return false;
	}
	
	public void umDoisTresEJa() {
		while (!terminou()) {
			for (CarroCorrida carro : carros.keySet()) {
				carro.acelerar();
				int distancia = carros.get(carro);
				distancia+= carro.getVelocidade();
				carros.put(carro, distancia);
				
			}
		}
		
		for (CarroCorrida carro : carros.keySet()) {
			System.out.println(carro.getNome() + " - " + carros.get(carro));
		}
	}
}
