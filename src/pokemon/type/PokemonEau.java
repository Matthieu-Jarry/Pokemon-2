package pokemon.type;

import pokemon.Pokemon;

public class PokemonEau extends Pokemon{

	public PokemonEau(String nom) {
		super(nom, TypePokemon.EAU);
	}

	@Override
	public void attaquer(Pokemon p) {
		log("J'attaque " +p.getNom());
		p.subir(this);	
	}

	@Override
	public void subir(Pokemon p) {
		switch (p.getType()) {
		case PLANTE -> this.hp -= p.getAtk()*2;
		case FEU, EAU -> this.hp -= p.getAtk()/2;
		default ->
		throw new IllegalArgumentException("Unexpected value: " + p.getType());
		}	
	}

}
