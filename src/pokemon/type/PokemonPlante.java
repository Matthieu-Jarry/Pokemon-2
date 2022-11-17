package pokemon.type;

import pokemon.Pokemon;

public class PokemonPlante extends Pokemon{

	public PokemonPlante(String nom) {
		super(nom, TypePokemon.PLANTE);
	}

	@Override
	public void attaquer(Pokemon p) {
		log("J'attaque " +p.getNom());
		p.subir(this);	
	}

	@Override
	public void subir(Pokemon p) {
		switch (p.getType()) {
		case FEU -> this.hp -= p.getAtk()*2;
		case EAU, PLANTE -> this.hp -= p.getAtk()/2;
		default ->
		throw new IllegalArgumentException("Unexpected value: " + p.getType());
		}	
	}

}
