package br.edu.ifsc.exceptions;

public class CadastroException extends Exception {

	private static final long serialVersionUID = 1L;

	public CadastroException() {
		super("Problema ao cadastrar!");
		System.out.println("Aus�ncia de dados ou dados incorretamente inseridos");
	}
}
