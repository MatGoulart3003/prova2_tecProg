package br.edu.univas.vo;

import java.util.Scanner;

public class CostumerController {

	Scanner scan = new Scanner(System.in);
	
	public Costumer createCustomer() throws PaymentMethodNotAllowedExeption {
		
		System.out.println("Digite o nome do Consumidor");
		String name = scan.nextLine();
		System.out.println("Digite o CPF do Consumidor");
		String cpf = scan.nextLine();
		System.out.println("Digite agora o indicador ID do Consumidor à ser cadastrado");
		long id = ReadLong();
		Costumer cost = new Costumer(id, name, cpf);
		
		int option = choosePaymentMethod();
		
		if (option <= 0 || option > 4) {
		
			throw new PaymentMethodNotAllowedExeption();
		
		}else {

			return cost;
			
		}
	}
	
	public int ReadInt() {
		int aux = scan.nextInt();
		scan.nextLine();
		return aux;
	}
	
	public long ReadLong() {
		
		long aux = scan.nextLong();
		scan.nextLine();
		return aux; 
	}
	
	public int choosePaymentMethod () {
		
		System.out.println("Digite uma opção de pagamento");
		System.out.println("1 - Débito na Conta ");
		System.out.println("2 - Cartão de crédito");
		System.out.println("3 - PIX");
		System.out.println("4 - Boleto Bancário");
		int option = ReadInt();
					
		return option;
	}
	
}
