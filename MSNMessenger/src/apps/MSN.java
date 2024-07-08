package apps;

public class MSN extends ServicoMensagemInstantanea{
	@Override
	public void enviarMensagem() {
		super.validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		super.salvarHistoricoMensagem();
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
		
	}
}
