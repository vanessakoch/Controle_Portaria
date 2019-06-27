package br.edu.ifsc.entities;

public class Veiculo {
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private String renavam;

	public Veiculo(String marca, String modelo, String placa) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}

	public Veiculo(String marca, String modelo, int ano, String placa, String renavam, PessoaFisica proprietario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.renavam = renavam;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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

}
