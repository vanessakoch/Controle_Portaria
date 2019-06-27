package br.edu.ifsc.exceptions;

public class LoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public LoginException() {
		super("Tente Novamente");
		System.out.println("Usuário ou senha não encontrados");
	}
}
