package dresseur;

import java.util.ArrayList;

import pokemon.Pokemon;

public class SacADos {
	
	private Dresseur dresseur;
	private ArrayList<Pokemon> pokemons = new ArrayList<>();

	public SacADos(Dresseur dresseur) {
		this.dresseur = dresseur;
	}
	
	public int getNbPokemons() {
		return pokemons.size();
	}
	
	public void capturerPokemons() {
		
	}
	
	public void combatre(Dresseur adversaire) {
		this.combat(adversaire);
		if (dresseur.peutCombatre()) {
			dresseur.prendreArgent(adversaire);
		}
		else {
			adversaire.prendreArgent(dresseur);
		}
	}
	
	private void combat(Dresseur adversaire) {
		boolean combat = (dresseur.peutCombatre() && adversaire.peutCombatre());
		System.out.println("\nCOMBAT !\n");
		while (combat) {
			dresseur.getNextPokemon().attaquer(adversaire.getNextPokemon());
			if (!adversaire.peutCombatre()) {
				combat = false;
			}
			else {
				adversaire.getNextPokemon().attaquer(dresseur.getNextPokemon());
				if (!dresseur.peutCombatre()) {
					combat = false;
				}
			}
		}
	}
	
	public void pokeCenter() {
		for (Pokemon p : pokemons) {
			p.soigner();
		}
	}

	public Pokemon getNextPokemon() {
		for (Pokemon p : pokemons) {
			if (!p.isKO()) {
				return p;
			}
		}
		return null;
	}
	
	public boolean peutCombatre() {
		return getNextPokemon() != null;
	}

}
