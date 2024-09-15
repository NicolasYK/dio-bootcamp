package entities;

import java.util.ArrayList;
import java.util.HashMap;

import abstracts.Reprodutor;

public class Ipod extends Reprodutor{
	
	private ArrayList<String> tipomidia;
	
	public Ipod(ArrayList<String> tipomidia,String nome_Reprodutor, HashMap<String, Integer> lista) {
		super(nome_Reprodutor, lista);
		this.tipomidia = tipomidia;
	}

	public void listarVideo(HashMap<String, Integer> playlistVideo) {
		for(String titulos : playlistVideo.keySet()) {
			System.out.println(titulos+" possui duração de: "+ playlistVideo.get(titulos)+"minutos");
		}
	}
	
	public void listarMusica(HashMap<String, Integer> playlistMusica) {
		for(String nome : playlistMusica.keySet()) {
			System.out.println(nome+" possui duração de: "+ playlistMusica.get(nome)+"minutos");
		}
	}
	
	
	// Get & Set
	public ArrayList<String> getTipomidia() {
		return tipomidia;
	}
	
	public void setTipomidia(ArrayList<String> tipomidia) {
		this.tipomidia = tipomidia;
	}

	// toString
	@Override
	public String toString() {
		return "Ipod [tipomidia=" + tipomidia + ", getNome()=" + getNome() + ", getLista()=" + getLista() + "]";
	}


}
