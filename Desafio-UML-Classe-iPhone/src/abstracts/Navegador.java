package abstracts;

import java.util.ArrayList;

import interfaces.Buscador;

public abstract class Navegador implements Buscador{
	
	private String nomeNavegador;
	private String motorBusca;
	private boolean anonimo;
	private ArrayList<String> guias;
	
	public Navegador(String nome, String motor, boolean ativarAnonimo, ArrayList<String> guias) {
		this.nomeNavegador = nome;
		this.motorBusca = motor;
		this.anonimo = ativarAnonimo;
		this.guias = guias;
	}
	
	public void ativarModoAnonimo(boolean ativar) {
		this.anonimo = !ativar;
		if(anonimo) {
			System.out.println("Ativando o modo anonimo.");
		}
		else {
			System.out.println("Desativando o modo anonimo");
		}
	}
	
	public static void abrirNovasGuias(String url) {
		System.out.println("Abrindo nova guia contendo: " + url);
	}
	
	public static void fechandoGuia(String url) {
		System.out.println("Fechando a guia: "+ url);
	}
	
	
	public static void adicionarFavoritos(ArrayList<String> lista_favoritos, String pagina) {
		lista_favoritos.add(pagina);
		System.out.println("Adicionando "+ pagina + " à lista de favoritos");
	}
	
	public static void removendoFavoritos(ArrayList<String> lista_favoritos, String pagina) {
		if(lista_favoritos.contains(pagina)) {
			lista_favoritos.remove(pagina);
			System.out.println("Removendo a página da lista de favoritos.");
		}
		else {
			System.out.println("Não foi encontrado esta página na lista.");
		}
	}
	
	@Override
	public void atualizar(String url) {
		System.out.println("Atualizando a página: "+url);
	}
	@Override
	public void buscar(String url) {
		System.out.println("Buscando: "+url);
	}

	
	// Get & Set
	public String getNomeNavegador() {
		return nomeNavegador;
	}
	
	public void setNomeNavegador(String nomeNavegador) {
		this.nomeNavegador = nomeNavegador;
	}
	
	public String getMotorBusca() {
		return motorBusca;
	}
	
	public void setMotorBusca(String motorBusca) {
		this.motorBusca = motorBusca;
	}

	public boolean isAnonimo() {
		return anonimo;
	}

	public void setAnonimo(boolean anonimo) {
		this.anonimo = anonimo;
	}

	public ArrayList<String> getGuias() {
		return guias;
	}

	public void setGuias(ArrayList<String> guias) {
		this.guias = guias;
	}
	
}
