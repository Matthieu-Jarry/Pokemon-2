package test;

import pokemon.Pokemon0;

public class ScenarioTest {
	
	private static void testPokemon0() {
		System.out.println("TEST POKEMON0\n");
		Pokemon0 p1 = new Pokemon0("Rhinolove");
		Pokemon0 p2 = new Pokemon0("Chovsourir");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
	}
	
	private static void testPokemonTypes() {
		
	}
	
	private static void testDresseur() {
		
	}
	
	private static void testEvolution() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPokemon0();
		testPokemonTypes();
		testDresseur();
		testEvolution();
	}

}
