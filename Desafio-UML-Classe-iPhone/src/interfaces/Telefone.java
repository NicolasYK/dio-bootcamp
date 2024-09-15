package interfaces;

import java.util.HashMap;

public interface Telefone {
	void ligarNumero(String numero);
	void desligarChamada(String numero);
	void atenderChamada(String numero);
	void enviarCorreioVoz(String numero);
	void listarContato(HashMap<String, String> lista);
}
