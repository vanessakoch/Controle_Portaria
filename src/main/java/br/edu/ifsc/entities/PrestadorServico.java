package br.edu.ifsc.entities;

import br.edu.ifsc.entities.PessoaJuridica;

public class PrestadorServico extends PessoaJuridica {
	private String servico;
	private String local;

	public PrestadorServico(String razaoSocial, String cnpj, String endereco, String inscricaoEstadual, String telefone,
			String servico, String local) {
		super(razaoSocial, cnpj, endereco, inscricaoEstadual, telefone);
		this.servico = servico;
		this.local = local;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
