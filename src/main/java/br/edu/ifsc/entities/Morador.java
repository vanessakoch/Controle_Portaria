package br.edu.ifsc.entities;


import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Morador extends PessoaFisica {
	private SimpleIntegerProperty apartamento;
	private SimpleStringProperty bloco;
	private SimpleIntegerProperty qtdMoradores;
	private SimpleStringProperty vagaGaragem;
	private SimpleStringProperty entrada;
	private SimpleBooleanProperty menorIdade;

	public Morador(String nome, String cpf, String dataNasc, String telefone, int apartamento, String bloco,
			int qtdMoradores, String vagaGaragem, String entrada, boolean menorIdade) {
		super(nome, cpf, dataNasc, telefone);
		this.apartamento = new SimpleIntegerProperty(apartamento);
		this.bloco = new SimpleStringProperty(bloco);
		this.qtdMoradores = new SimpleIntegerProperty(qtdMoradores);
		this.vagaGaragem = new SimpleStringProperty(vagaGaragem);
		this.entrada = new SimpleStringProperty(entrada);
		this.menorIdade = new SimpleBooleanProperty(false);
	}

	public Morador(String nome, String cpf, String dataNasc, String telefone, int apartamento, String bloco,
			int qtdMoradores, String entrada, boolean menorIdade) {
		super(nome, cpf, dataNasc, telefone);
		this.apartamento = new SimpleIntegerProperty(apartamento);
		this.bloco = new SimpleStringProperty(bloco);
		this.qtdMoradores = new SimpleIntegerProperty(qtdMoradores);
		this.entrada = new SimpleStringProperty(entrada);
		this.menorIdade = new SimpleBooleanProperty(false);

	}

	public SimpleIntegerProperty apartamentoProperty() {
		return apartamento;
	}

	public SimpleIntegerProperty qtdMoradoresProperty() {
		return qtdMoradores;
	}

	public SimpleBooleanProperty selectedProperty() {
		return menorIdade;
	}

	public SimpleStringProperty blocoProperty() {
		return bloco;
	}

	public SimpleStringProperty vagaGaragemProperty() {
		return vagaGaragem;
	}
	public SimpleStringProperty entradaProperty() {
		return entrada;
	}

	public int getApartamento() {
		return apartamento.get();
	}

	public void setApartamento(int apartamento) {
		this.apartamento.set(apartamento);
	}

	public String getBloco() {
		return bloco.get();
	}

	public void setBloco(String bloco) {
		this.bloco.set(bloco);;
	}

	public int getQtdMoradores() {
		return qtdMoradores.get();
	}

	public void setQtdMoradores(int qtdMoradores) {
		this.qtdMoradores.set(qtdMoradores);
	}

	public String getVagaGaragem() {
		return vagaGaragem.get();
	}

	public void setVagaGaragem(String vagaGaragem) {
		this.vagaGaragem.set(vagaGaragem);
	}

	public String getEntrada() {
		return entrada.get();
	}

	public boolean isMenorIdade() {
		return menorIdade.get();
	}

	public void setMenorIdade(boolean menorIdade) {
		this.menorIdade.set(menorIdade);
	}
	

}
