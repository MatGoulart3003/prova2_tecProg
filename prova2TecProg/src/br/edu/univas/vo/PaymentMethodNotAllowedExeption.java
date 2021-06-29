package br.edu.univas.vo;

public class PaymentMethodNotAllowedExeption extends Exception {

	private static final long serialVersionUID = 8600176082589338081L;
	
	private String message = "Meio de pagamento inválido, selecione uma forma de pagamento válida:";
	
	public PaymentMethodNotAllowedExeption () {
		
		System.out.println(message);
		
	}
}
