package apps;
public class Telegram extends ServicoMensagemInstantanea{
	@Override
	public void enviarMensagem() {
		super.validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		super.salvarHistoricoMensagem();
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
		
	}
}
