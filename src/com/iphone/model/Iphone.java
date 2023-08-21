package com.iphone.model;

import com.iphone.model.interfaces.Ipod;
import com.iphone.model.interfaces.Navegador;
import com.iphone.model.interfaces.Telefone;

public class Iphone implements Telefone, Ipod, Navegador {
	private String usuario;
	private String numero;
	
	public Iphone(String usuario, String numero) {
		this.usuario = usuario;
		this.numero = numero;
		apresentacao();
	}
	
	public Iphone() {
		this.usuario = "Arnaldo";
		this.numero = "912345678";
	}
	
	public void apresentacao() {
		System.out.println("Usuário: " + usuario);
		System.out.println("Numero: " + numero);
	}
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando ligação");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba no navegador");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
	}

	@Override
	public void atualizaPagina() {
		System.out.println("Atualizando página atual");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Preparando pra tocar a musica ");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Ipod");
		Ipod iphone = new Iphone();
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Green Days");
		System.out.println();
		
		System.out.println("Navegador");
		Navegador navegador = new Iphone();
		navegador.adicionarNovaAba();
		navegador.atualizaPagina();
		navegador.exibirPagina();
		System.out.println();
		
		System.out.println("Telefone");
		Telefone telefone = new Iphone("João", "912341234");
		telefone.atender();
		telefone.desligar();
		telefone.iniciarCorreioDeVoz();
		System.out.println();
	}
}
