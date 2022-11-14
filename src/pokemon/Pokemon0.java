package pokemon;

import java.util.Random;

public class Pokemon0 {
	
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax;
	private static Random random = new Random();
	
	public Pokemon0(String nom) {
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
	
	public boolean isKO() {
		return hp == 0;
	}
	
	public void attaquer(Pokemon0 p) {
		
	}
	
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
