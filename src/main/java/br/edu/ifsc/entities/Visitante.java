package br.edu.ifsc.entities;

import java.util.Date;

public class Visitante extends PessoaFisica {

	private String motivo;
	private String local;

	public Visitante(String nome, String cpf, Date dataNasc, String telefone, String motivo, String local) {
		super(nome, cpf, dataNasc, telefone);
		this.motivo = motivo;
		this.local = local;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
