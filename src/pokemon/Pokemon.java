package pokemon;

import java.util.Random;

import pokemon.type.TypePokemon;

public abstract class Pokemon {
	
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax = 10;
	private TypePokemon type;
	private static Random random = new Random();
	
	protected Pokemon(String nom, TypePokemon type) {
		this.nom = nom;
		this.type = type;
		this.niveau = random.nextInt(1, niveauMax + 1);
		this.hp = this.niveau*2;
		this.atk = (this.niveau/2) +1;
	}
	
	public String getNom() {
		return nom;
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
	
	public abstract void attaquer(Pokemon p);
	
	public abstract void subir(Pokemon p);
	
	public void soigner() {
		this.hp = this.niveau*2;
	}
	
	public String toString() {
		return "Je m'appelle " + getNom() + " !\nje suis de type " +getType()+ "\nje suis niveau " +getNiveau()+ "\nj'ai " +getHp()+ " points de vie\nmon attaque de base est de " +getAtk();
	}
	
	private String prefixe() {
		return "[Pokemon " + getNom() + "] : ";
	}
	
	public void log(String msg) {
		System.out.println(prefixe()+msg);
	}

}
