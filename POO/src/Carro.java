
public class Carro extends Veiculo{
	
	public void ligar() {
		confereCombustivel();
		confereCambio();
		System.out.println("Carro Ligado");
	}
	private void confereCombustivel() {
		System.out.println("Enche");
	}
	private void confereCambio() {
		System.out.println("ta no p");
	}
}
