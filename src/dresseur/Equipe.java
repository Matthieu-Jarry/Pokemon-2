package dresseur;

public enum Equipe {
	
	SAGESSE("Sagesse"),
	BRAVOURE("Bravoure"),
	INTUITION("Intuition");
	
	private String name;
	
	private Equipe(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
