package metodos;

public class Usuarios {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println(smartTv.canal);
		System.out.println(smartTv.ligada);
		System.out.println(smartTv.volume);
		
		smartTv.alternarLigadoDesligado();
		System.out.println(smartTv.ligada);

	}

}
