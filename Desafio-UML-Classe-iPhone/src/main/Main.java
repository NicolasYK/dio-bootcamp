package main;

import java.util.ArrayList;
import java.util.HashMap;

import entities.Iphone;
import entities.Ipod;
import entities.Safari;

public class Main {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> dbVideo = new HashMap<String, Integer>();
		HashMap<String, Integer> dbMusic = new HashMap<String, Integer>();
		HashMap<String, String> dbContato = new HashMap<String, String>();
		ArrayList<String> dbMidia = new ArrayList<String>();
		HashMap<String, Integer> dbConteudo = new HashMap<String, Integer>();
		dbConteudo.putAll(dbMusic);
		dbConteudo.putAll(dbVideo);

		ArrayList<String> dbGuias = new ArrayList<String>();
		ArrayList<String> dbFav = new ArrayList<String>();
		
		Iphone celular = new Iphone("Iphone original", "(11)97777-7777", dbVideo, dbMusic, dbContato, 
				new Ipod(dbMidia, "Ipod", dbConteudo), new Safari("Safari", "Chrome", false, dbGuias, dbFav), false);
		
		celular.desbloquear();
		System.out.println(celular);
	}
}
