package br.edu.univas.vo;

import java.util.Scanner;

public class CostumerController {

	Scanner scan = new Scanner(System.in);
	
	public Costumer createCustomer() {
		
		System.out.println("Digite o nome do Consumidor");
		String name = scan.nextLine();
		System.out.println("Digite o CPF do Consumidor");
		String cpf = scan.nextLine();
		System.out.println("Digite agora o indicador ID do Consumidor à ser cadastrado");
		long id = ReadLong();
		
		Costumer cost = new Costumer(id, name, cpf);
		
		return cost;
	}
	
	public long ReadLong() {
		
		long aux = scan.nextLong();
		scan.nextLine();
		
		return aux; 
	}
	
}
