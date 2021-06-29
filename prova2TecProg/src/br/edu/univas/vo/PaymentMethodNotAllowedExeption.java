package br.edu.univas.vo;

public class PaymentMethodNotAllowedExeption extends Exception {

	
	private static final long serialVersionUID = -9077511661664728313L;

	private String message = "Meio de pagamento inválido, selecione uma forma de pagamento válida:";
	
	public PaymentMethodNotAllowedExeption () {
		
		System.out.println(message);
		
	}
}
