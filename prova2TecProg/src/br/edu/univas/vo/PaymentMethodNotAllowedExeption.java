package br.edu.univas.vo;

public class PaymentMethodNotAllowedExeption extends Exception {

	
	private static final long serialVersionUID = -9077511661664728313L;

	private String message = "Meio de pagamento inv�lido, selecione uma forma de pagamento v�lida:";
	
	public PaymentMethodNotAllowedExeption () {
		
		System.out.println(message);
		
	}
}
