package metodos;

public class SmartTv {
	boolean ligada=false;
	int canal=1;
	int volume=25;
	
	public void alternarLigadoDesligado() {
		ligada = !ligada;
	}
	
	public void aumentarCanal() {
		++canal;
	}
	
	public void diminuirCanal() {
		--canal;
	}
	
	public void aumentarVolume() {
		++volume;
	}
	
	public void diminuirVolume() {
		--volume;
	}
	
	public void trocarCanal(int valor) {
		canal = valor;
	}


}
