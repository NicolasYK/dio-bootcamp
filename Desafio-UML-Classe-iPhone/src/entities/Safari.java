package entities;

import java.util.ArrayList;

import abstracts.Navegador;

public class Safari extends Navegador{
	
	private ArrayList<String> favoritos;
	private boolean leitura;
	
	public Safari(String nome, String motor, boolean ativarAnonimo, ArrayList<String> guias, ArrayList<String> favoritos) {
		super(nome, motor, ativarAnonimo, guias);
		this.favoritos = favoritos;
	}
	
	public void modoLeitura() {
		this.leitura = !leitura;
		if(leitura) {
			System.out.println("Ativando modo leitura.");
		}
		else {
			System.out.println("Desativando modo leitura.");
		}
	}
	
	// Get & Set
	public ArrayList<String> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(ArrayList<String> favoritos) {
		this.favoritos = favoritos;
	}

	public boolean isLeitura() {
		return leitura;
	}

	public void setLeitura(boolean leitura) {
		this.leitura = leitura;
	}

	// toString
	@Override
	public String toString() {
		return "Safari [favoritos=" + favoritos + ", getNomeNavegador()=" + getNomeNavegador() + ", getMotorBusca()="
				+ getMotorBusca() + ", isAnonimo()=" + isAnonimo() + ", getGuias()=" + getGuias() + "]";
	}

	
}
