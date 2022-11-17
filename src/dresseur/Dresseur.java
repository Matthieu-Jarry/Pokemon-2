package dresseur;

import java.util.ArrayList;

import pokemon.Pokemon;

public class Dresseur {
	
	public static int nbDresseurs;
	private String nom;
	private int argent;
	private SacADos sacADos;
	private Equipe equipe;
	
	public Dresseur(String nom) {
		this.nom = nom;
		this.sacADos = new SacADos(this);
		this.argent = 150;
		choixEquipe();
		nbDresseurs++;
	}
	
	private void choixEquipe() {
		this.equipe = Equipe.SAGESSE;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getNbPokemons() {
		return sacADos.getNbPokemons();
	}
	
	public Pokemon getNextPokemon() {
		return sacADos.getNextPokemon();
	}
	
	public void prendreArgent(Dresseur p) {
		this.argent+=10;
		p.argent-=10;
	}
	
	public void capturerPokemons() {
		this.sacADos.capturerPokemons();
	}
	
	public boolean peutCombatre() {
		return this.sacADos.peutCombatre();
	}
	
	public void combatre(Dresseur p) {
		this.sacADos.combatre(p);
	}
	
	public void pokeCenter() {
		this.sacADos.pokeCenter();
	}
	
	public String toString() {
		return "Je m'appelle " + getNom()
				+ "\nj'ai " + getNbPokemons() + "pokemons!"
				+ "\nj'appatiens à l'équipe " + equipe.toString()
				+ "\nje possède " + this.argent + " $";
	}
	
	private String prefixe() {
		return "[Dresseur " +getNom()+"] : ";
	}
	
	public void log(String msg) {
		System.out.println(prefixe() + msg);
	}

}
