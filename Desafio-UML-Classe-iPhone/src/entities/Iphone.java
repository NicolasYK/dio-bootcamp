package entities;

import java.util.HashMap;
import java.util.Objects;

import interfaces.Telefone;

public class Iphone implements Telefone{

	private String modelo;
	private String numeroTelefone;
	private HashMap<String, Integer> listaVideo;
	private HashMap<String, Integer> listaMusica;
	private HashMap<String, String> listaContato;
	private boolean desbloqueio;
	private Ipod playerMultiMidia;
	private Safari navegador;
	
	public Iphone(String modelo, String telefone, HashMap<String, Integer> playlistvideo, 
			HashMap<String, Integer> playlistmusica, HashMap<String, String> listacontatos,
			Ipod multimidia, Safari navegador, boolean desbloqueio) {
		this.modelo = modelo;
		this.numeroTelefone = telefone;
		this.listaMusica = playlistmusica;
		this.listaVideo = playlistvideo;
		this.listaContato = listacontatos;
		this.playerMultiMidia = multimidia;
		this.navegador = navegador;
		this.desbloqueio = desbloqueio;
	}
	
	public void desbloquear() {
		this.desbloqueio = !desbloqueio;
		if(desbloqueio) {
			System.out.println("Desbloqueando o celular.");
		}
		else {
			System.out.println("Bloqueando o celular.");
		}
	}
	
	@Override
	public void atenderChamada(String numero) {
		if(listaContato.containsKey(numero)) {
			System.out.println("Atendendo a chamada de "+ listaContato.get(numero));
		}
		else {
			System.out.println("Atendendo a chamada de algum desconhecido...");
		}
	}

	@Override
	public void desligarChamada(String numero) {
		if(listaContato.containsKey(numero)) {
			System.out.println("Desligando a chamada de "+ listaContato.get(numero));
		}
		else {
			System.out.println("Desligando a chamada de algum desconhecido...");
		}
	}
	@Override
	public void enviarCorreioVoz(String numero) {
		if(listaContato.containsKey(numero)) {
			System.out.println("Enviando para o correio de voz a chamada de "+ listaContato.get(numero));
		}
		else {
			System.out.println("Enviando para o correio de voz a chamada de algum desconhecido...");
		}
		
	}
	@Override
	public void ligarNumero(String numero) {
		if(listaContato.containsKey(numero)) {
			System.out.println("Ligando para "+ listaContato.get(numero));
		}
		else {
			System.out.println("Ligando para algum desconhecido...");
		}
		
	}
	@Override
	public void listarContato(HashMap<String, String> lista) {
		for(String contatos : lista.keySet()) {
			System.out.println(lista.get(contatos)+" : "+ contatos);
		}
	}
	
	// Get & Set
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public HashMap<String, Integer> getListaVideo() {
		return listaVideo;
	}

	public void setListaVideo(HashMap<String, Integer> listaVideo) {
		this.listaVideo = listaVideo;
	}

	public HashMap<String, Integer> getListaMusica() {
		return listaMusica;
	}

	public void setListaMusica(HashMap<String, Integer> listaMusica) {
		this.listaMusica = listaMusica;
	}

	public HashMap<String, String> getListaContato() {
		return listaContato;
	}

	public void setListaContato(HashMap<String, String> listaContato) {
		this.listaContato = listaContato;
	}

	public Ipod getPlayerMultiMidia() {
		return playerMultiMidia;
	}

	public void setPlayerMultiMidia(Ipod playerMultiMidia) {
		this.playerMultiMidia = playerMultiMidia;
	}

	public Safari getNavegador() {
		return navegador;
	}

	public void setNavegador(Safari navegador) {
		this.navegador = navegador;
	}

	public boolean isDesbloqueio() {
		return desbloqueio;
	}

	public void setDesbloqueio(boolean desbloqueio) {
		this.desbloqueio = desbloqueio;
	}

	// HashCode
	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}

	// Hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Iphone other = (Iphone) obj;
		return Objects.equals(modelo, other.modelo);
	}

	// toString
	@Override
	public String toString() {
		return "Iphone [modelo=" + modelo + ", numeroTelefone=" + numeroTelefone + ", listaVideo=" + listaVideo
				+ ", listaMusica=" + listaMusica + ", listaContato=" + listaContato + ", desbloqueio=" + desbloqueio
				+ ", playerMultiMidia=" + playerMultiMidia + ", navegador=" + navegador + "]";
	}




}
