package pokemons;

public abstract class Pokemon implements Comparable<Pokemon>{
	private String nom;
	private int energia,vida,danybase,defensa,precisio,vidaperm;
	
	String[] nom_poke = {"SQUIRTLE", "PSYCUK", "MEOWTH", "JIGGLYPUFF", "PONYTA", 
			"CHARIZARD", "ZAPDOS", "ARTICUNO", "MOLTRES", "MEW", "MEOTWO", "EEVEE", 
			"PIKACHU", "CHARIZARD", "GENGAR", "ARCANINE", "BULBASUR", "BLAZIKEN", "UMBREON",
			"LUCARIO", "GARDEVOIR", "DRAGONITE", "ABSOL", "TYPHLOSION", "AMPHAROS", "FLYGON",
			"NINETALES", "TYRANITAR", "INFERNAPE", "SNORLAX", "TORTERRA", "LUXRAY",
			"SCIZOR", "MUDKIP", "GARCHOMP", "METAGROSS", "ALAKAZAM", "EMPOLEON", "SCEPTILE",
			"CUBONE", "RAYQUAZA", "AGGRON", "TOTODILE", "VOLCARONA", "MIMIKYU", "HERACROSS"};	
	
	public Pokemon(String tipo,String nombre, int vidaa){
		if(tipo.equals("aigua")) {
			this.nom=nombre;
			this.energia= 100;
			this.vida= vidaa;
			this.danybase=15;
			this.defensa=10;
			this.precisio=80;
			this.vidaperm=vidaa;
		}
		else if(tipo.equals("foc")) {
			this.nom=nombre;
			this.energia= 100;
			this.vida= vidaa;
			this.danybase=20;
			this.defensa=15;
			this.precisio=72;
			this.vidaperm=vidaa;
		}
		else if(tipo.equals("electric")) {
			this.nom=nombre;
			this.energia= 100;
			this.vida= vidaa;
			this.danybase=25;
			this.defensa=15;
			this.precisio=63;
			this.vidaperm=vidaa;
		}
	}
	public void resetStats() {
		this.energia=100;
		this.vida=vidaperm;
	}
	public String getNombre(){
		return this.nom;
	}
	public int getVida() {
		return this.vida;
	}
	public int getEnergia() {
		return this.energia;
	}
	public void setEnergia(int a) {
		this.energia=a;
	}
	public void setVida(int a) {
		this.vida=a;
	}
	@Override
	public String toString() {
		return("Nom: " + this.nom+"\n"+ "Energia: " + this.energia + "\n" + 
			"Vida: " + this.vida+ "\n"+ "Dany: " + this.danybase+ "\n"+ 
				"Defensa: " + this.defensa+ "\n" + "Precisió: " + this.precisio);
	}
	
	public int CompareTo(Pokemon p) {
		int resultado = 0;
		if (this.getEnergia()<p.getEnergia()) { resultado = -1; }
		else if (this.getEnergia()>p.getEnergia()) { resultado = 1; }
		else {
			if (this.getEnergia()<p.getEnergia()) { resultado = -1; }
			else if (this.getEnergia()>p.getEnergia()) { resultado = 1; }
			else { resultado = 0; }
		}
		return resultado;
	}
}
