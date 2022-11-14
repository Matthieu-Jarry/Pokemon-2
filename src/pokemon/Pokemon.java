package pokemon;

import java.util.Random;

import pokemon.type.TypePokemon;

public abstract class Pokemon {
	
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax;
	private TypePokemon type;
	private static Random random = new Random();
	
	public Pokemon(String nom, TypePokemon type) {
		this.nom = nom;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getNiveau() {
		return niveau;
	}
	
	public TypePokemon getType() {
		return type;
	}
	
	public boolean isKO() {
		return hp == 0;
	}
	
	public abstract void attaquer(Pokemon0 p);
	
	public abstract void subir(Pokemon p);
	
	public void soigner() {
		
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
