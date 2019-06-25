package br.edu.ifsc.entities;

public class Veiculo {
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private String renavam;
	private PessoaFisica proprietario;

	public Veiculo(String marca, String modelo, int ano, String placa, String renavam, PessoaFisica proprietario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.renavam = renavam;
		this.proprietario = proprietario;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getPlaca() {
		return placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public PessoaFisica getProprietario() {
		return proprietario;
	}

	public void setProprietario(PessoaFisica proprietario) {
		this.proprietario = proprietario;
	}

}
