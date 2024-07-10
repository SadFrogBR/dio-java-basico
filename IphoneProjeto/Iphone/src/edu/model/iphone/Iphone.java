package edu.model.iphone;

import edu.service.funcionalidades.AparelhoTelefonico;
import edu.service.funcionalidades.NavegadorNaInternet;
import edu.service.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Pagina " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizando");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
		
	}

	@Override
	public void SelecionarMusica(String musica) {
		System.out.println("Colocando musica " + musica);
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo telefonema");
		
	}

	@Override
	public void IniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

}
