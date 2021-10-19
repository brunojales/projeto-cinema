package br.com.cinema;

public class Sala {

	public String filme;
	public int classificacaoIndicativa;
	
	
	//Metodo
	public Sala(String filme, int classificacaoIndicativa) {
		this.filme = filme;
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	public void autorizarEntrada (int idade) {
		//verificar idade do cliente
		if(idade >= this.classificacaoIndicativa)
			System.out.println("Entrada Autorizada!");
		else
			System.out.println("Entrada Não Autorizada!");
		
	}
}
