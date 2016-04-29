
public class Principal {
	
	public static void main(String[] args) {
		
		Corrida corridaAmizade = new Corrida(2000);
		corridaAmizade.adicionaCarro(new CarroSoma("CarroA", 10, 110));
		corridaAmizade.adicionaCarro(new CarroSoma("CarroB", 8, 140));
		corridaAmizade.adicionaCarro(new CarroMult("CarroC", 1.7, 100));
		corridaAmizade.adicionaCarro(new CarroMult("CarroD", 1.4, 110));
		
		corridaAmizade.umDoisTresEJa();
		
	}

}
