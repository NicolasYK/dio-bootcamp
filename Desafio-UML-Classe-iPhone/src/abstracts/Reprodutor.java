package abstracts;

import java.util.HashMap;

import interfaces.Player;

public abstract class Reprodutor implements Player{
	
	private String nome;
	private HashMap<String, Integer> lista;
	
	public Reprodutor(String nome_Reprodutor, HashMap<String, Integer> lista) {
		this.nome = nome_Reprodutor;
		this.lista = lista;
	}
	
	@Override
	public void iniciar(String nome) {	
		if(lista.containsKey(nome)) {
			System.out.println("Iniciando a musica "+nome);
		}
		else {
			System.out.println("Não foi encontrado dentro da lista de reprodução...");
		}
		
	}
	
	@Override
	public void passar(String nome) {
		if(lista.containsKey(nome)) {
			System.out.println("Skippando "+nome);
		}
		else {
			System.out.println("Não foi encontrado dentro da lista de reprodução...");
		}
		
	}
	@Override
	public void pausar(String nome) {
		if(lista.containsKey(nome)) {
			System.out.println("Pausando a musica "+nome);
		}
		else {
			System.out.println("Não foi encontrado dentro da lista de reprodução...");
		}
	}
	
	public void avancar(String nome, Integer tempo) {
		if(lista.containsKey(nome)) {
			System.out.println("Avançando a musica "+nome+" para "+ lista.get(nome)+tempo);
		}
		else {
			System.out.println("Não foi encontrado dentro da lista de reprodução...");
		}
	}
	
	public void retroceder(String nome, Integer tempo) {
		if(lista.containsKey(nome)) {
			System.out.println("Retrocedendo a musica "+nome+" para "+ (lista.get(nome)-tempo));
		}
		else {
			System.out.println("Não foi encontrado dentro da lista de reprodução...");
		}
	}
	
	// Get & Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public HashMap<String, Integer> getLista() {
		return lista;
	}

	public void setLista(HashMap<String, Integer> lista) {
		this.lista = lista;
	}

	

}
