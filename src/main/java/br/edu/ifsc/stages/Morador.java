package br.edu.ifsc.stages;

import java.util.Date;

import br.edu.ifsc.entities.PessoaFisica;

public class Morador extends PessoaFisica {
	private int apartamento;
	private char bloco;
	private int qtdMoradores;
	private String vagaGaragem;
	private Date entrada;
	private boolean menorIdade;
	private String placaVeiculo;

	public Morador(String nome, String cpf, Date dataNasc, String telefone, int apartamento, char bloco,
			int qtdMoradores, String vagaGaragem, String placaCarro, Date entrada, boolean menorIdade) {
		super(nome, cpf, dataNasc, telefone);
		this.apartamento = apartamento;
		this.bloco = bloco;
		this.qtdMoradores = qtdMoradores;
		this.vagaGaragem = vagaGaragem;
		this.placaVeiculo = placaCarro;
		this.entrada = entrada;
		this.setMenorIdade(menorIdade);
	}

	public Morador(String nome, String cpf, Date dataNasc, String telefone, int apartamento, char bloco,
			int qtdMoradores, Date entrada, boolean menorIdade) {
		super(nome, cpf, dataNasc, telefone);
		this.apartamento = apartamento;
		this.bloco = bloco;
		this.qtdMoradores = qtdMoradores;
		this.entrada = entrada;
	}

	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public int getBloco() {
		return bloco;
	}

	public void setBloco(char bloco) {
		this.bloco = bloco;
	}

	public int getQtdMoradores() {
		return qtdMoradores;
	}

	public void setQtdMoradores(int qtdMoradores) {
		this.qtdMoradores = qtdMoradores;
	}

	public String getVagaGaragem() {
		return vagaGaragem;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	
	public void setVagaGaragem(String vagaGaragem) {
		this.vagaGaragem = vagaGaragem;
	}

	public Date getEntrada() {
		return entrada;
	}

	public boolean isMenorIdade() {
		return menorIdade;
	}

	public void setMenorIdade(boolean menorIdade) {
		this.menorIdade = menorIdade;
	}

}
