package dresseur;

public class Dresseur {
	
	public static int nbDresseurs;
	private String nom;
	private int argent;
	private SacADos sacADos;
	private Equipe equipe;
	
	public Dresseur(String nom) {
		super();
		this.nom = nom;
	}
	
	private void choixEquipe() {
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getNbPokemons() {
		return 1;
	}
	
	public void prendreArgent(Dresseur p) {
		
	}
	
	public void capturerPokemons() {
		
	}
	
	public boolean peutCombatre() {
		return true;
	}
	
	public void combattre(Dresseur p) {
		
	}
	
	public void pokeCenter() {
		
	}
	
	public String toString() {
		return "";
	}
	
	private String prefixe() {
		return "";
	}
	
	public void log(String msg) {
		
	}

}
