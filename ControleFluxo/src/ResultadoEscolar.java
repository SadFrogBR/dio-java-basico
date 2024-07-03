
public class ResultadoEscolar {

	public static void main(String[] args) {
		int nota = 4;
		
		
		if(nota >= 7) {
			System.out.println("Aprovadp");
		}else if(nota >= 5 && nota < 7) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
		String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota >= 5 ? "recuperação" : "reprovado";
		System.out.println(resultado);
		
	}

}
