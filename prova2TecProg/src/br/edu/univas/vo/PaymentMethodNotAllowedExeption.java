package br.edu.univas.vo;

public class PaymentMethodNotAllowedExeption extends Exception {

	private static final long serialVersionUID = 8600176082589338081L;
	
	private String message = "Meio de pagamento inv�lido, selecione uma forma de pagamento v�lida:";
	
	public PaymentMethodNotAllowedExeption () {
		
		System.out.println(message);
		
	}
}
