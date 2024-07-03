import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

	public static void main(String[] args) {
		double mesada = 50.0;
		
		while(mesada > 0) {
			double valorDoce = (int)ThreadLocalRandom.current().nextDouble(2, 8);
			if(valorDoce > mesada) {
				valorDoce = mesada;
			}
			
			System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
			mesada = mesada - valorDoce;
		}
		
		System.out.println("Mesada: " + mesada);
		System.out.println("Joaozinho comilaolao");

	}

}
