package apps;

public class Facebook extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		super.validarConectadoInternet();
		System.out.println("Enviando mensagem pelo facebook");
		super.salvarHistoricoMensagem();
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo facebook");
		
	}

}
