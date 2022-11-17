package pokemon.type;

import pokemon.Pokemon;

public class PokemonFeu extends Pokemon{

	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
	}

	@Override
	public void attaquer(Pokemon p) {
		log("J'attaque " +p.getNom());
		p.subir(this);	
	}

	@Override
	public void subir(Pokemon p) {
		switch (p.getType()) {
		case EAU -> this.hp -= p.getAtk()*2;
		case PLANTE, FEU -> this.hp -= p.getAtk()/2;
		default ->
		throw new IllegalArgumentException("Unexpected value: " + p.getType());
		}	
	}



}
