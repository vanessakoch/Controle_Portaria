package br.edu.ifsc.entities;

import java.util.Date;

public class Visitante extends PessoaFisica {

	private String localVisita;

	public Visitante(String nome, String cpf, Date dataNasc, String telefone, String local) {
		super(nome, cpf, dataNasc, telefone);
		this.localVisita = local;
	}

	public String getLocal() {
		return localVisita;
	}

	public void setLocal(String local) {
		this.localVisita = local;
	}

}
