package br.edu.ifsc.exceptions;

public class LoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public LoginException() {
		super("Deu pau no login");
		System.out.println("Criei a exce��o");
	}
}
