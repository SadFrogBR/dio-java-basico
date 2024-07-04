
public class FormatadorCep {

	public static void main(String[] args) {
		try {
			String cep = formatarCep("2376506");
			System.out.println(cep);
		} catch (CepInvalido e) {
			// TODO Auto-generated catch block
			System.out.println("Faz o L");
		}

	}
	
	static String formatarCep(String cep) throws CepInvalido {
	    if (cep.length() != 8) {
	        throw new CepInvalido();
	    }
	    // Simulando um CEP formatado
	    return "23.765-064";
	}

}
