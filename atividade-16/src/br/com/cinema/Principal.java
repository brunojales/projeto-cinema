package br.com.cinema;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		Sala sala1 = new Sala("Matrix" , 14);
		Sala sala2 = new Sala("Joao e Maria", 16);
		Sala sala3 = new Sala("Detona Ralph", 0);
		Sala sala4 = new Sala("Instinto selvagem", 18 );
		Sala sala5 = new Sala("Buscando...", 12 );

		//Entrada de dados
		System.out.println("Informe o nome: ");
		cliente.nome = leia.nextLine();
		System.out.println("Informe sua idade: ");
		cliente.idade = leia.nextInt();
		 //limpeza de buffer
		leia.nextLine();
		
		System.out.println("Informe o numero da sala:");
		System.out.println("Sala 1 - Matrix , 14 anos");
		System.out.println("Sala 2 -Joao e Maria, 16 anos ");
		System.out.println("Sala 3 - Detona Ralph, Livre");
		System.out.println("Sala 4 - Instinto selvagem, 18 anos");
		System.out.println("Sala 5 - Buscando..., 12 anos");
		cliente.sala = leia.nextInt();
		
		switch (cliente.sala) {
		case 1:
			sala1.autorizarEntrada(cliente.idade);
			break;
		case 2:
			sala2.autorizarEntrada(cliente.idade);
			break;
		case 3:
			sala3.autorizarEntrada(cliente.idade);
			break;
		case 4:
			sala4.autorizarEntrada(cliente.idade);
			break;
		case 5:
			sala5.autorizarEntrada(cliente.idade);
			break;
		default:
		System.out.println("Sala não encontrada.");
		
		}
		
		
		//Fecha o objeto da classe Scanner
		leia.close();
	}

}
