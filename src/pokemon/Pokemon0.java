package pokemon;

import java.util.Random;

public class Pokemon0 {
	
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax = 10;
	private static Random random = new Random();
	
	public Pokemon0(String nom) {
		this.nom = nom;
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
	
	public boolean isKO() {
		return hp == 0;
	}
	
	public void attaquer(Pokemon0 p) {
		log("J'attaque " +p.getNom());
		p.hp -= this.atk;
		if (p.getHp() < 0 ) {
			p.hp = 0;
		}
	}
	
	public void soigner() {
		this.hp = this.niveau*2;
	}
	
	public String toString() {
		return "Je m'appelle " + getNom() + "!\nje suis niveau " +getNiveau()+ "\nj'ai " +getHp()+ " points de vie\nmon attaque de base est de " +getAtk();
	}
	
	private String prefixe() {
		return "[Pokemon " + getNom() + "] : ";
	}
	
	public void log(String msg) {
		System.out.println(prefixe()+msg);
	}

}
