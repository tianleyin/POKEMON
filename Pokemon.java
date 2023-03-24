package pokemons;

import java.util.Comparator;

public abstract class Pokemon implements Comparator<Pokemon> {
	private String nom, tipo_pokemon;
	private int energia,vida,danybase,defensa,precisio,vidaperm;
	
	public Pokemon(String tipo,String nombre){
		if(tipo.equals("aigua")) {
			this.tipo_pokemon = tipo;
			this.nom=nombre;
			this.energia= 100;
			this.vida= (int) (Math.random() * 150 + 250);
			this.danybase=15;
			this.defensa=10;
			this.precisio=80;
			this.vidaperm=vida;
		}
		else if(tipo.equals("foc")) {
			this.tipo_pokemon = tipo;
			this.nom=nombre;
			this.energia= 100;
			this.vida= (int) (Math.random() * 150 + 250);
			this.danybase=20;
			this.defensa=15;
			this.precisio=72;
			this.vidaperm=vida;
		}
		else if(tipo.equals("electric")) {
			this.tipo_pokemon = tipo;
			this.nom=nombre;
			this.energia= 100;
			this.vida= (int) (Math.random() * 150 + 250);
			this.danybase=25;
			this.defensa=15;
			this.precisio=63;
			this.vidaperm=vida;
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
		return(this.tipo_pokemon + " || Nom: " + this.nom+", " + "Energia: " + this.energia + ", " + 
			"Vida: " + this.vida+ ", "+ "Dany: " + this.danybase+ ", "+ 
				"Defensa: " + this.defensa+ ", " + "Precisió: " + this.precisio);
	}
	
	@Override
	public int compare(Pokemon p1, Pokemon p2) {
		return p1.getVida() - p2.getVida();
	}
}
