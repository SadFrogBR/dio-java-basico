
public class App {

	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.ligar();
		jeep.setChassi("jose");
		System.out.println(jeep.getChassi());
		Moto honda = new Moto();
		honda.ligar();

	}

}
