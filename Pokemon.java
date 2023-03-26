package pokemons;
import java.util.Comparator;
public abstract class Pokemon implements Comparable<Pokemon> {
	private String nom,tipo_pokemon;
	private int energia,vida,danybase,defensa,precisio,vidaperm;
	
	Pokemon(String tipo,String nombre){
		if(tipo.equals("aigua")) {
			int vidaa = (int) (Math.random() * 150 + 250);
			this.nom=nombre;
			this.energia= 100;
			this.vida= vidaa;
			this.danybase=15;
			this.defensa=10;
			this.precisio=80;
			this.vidaperm=vidaa;
			this.tipo_pokemon=tipo;
		}
		else if(tipo.equals("foc")) {
			int vidaa = (int) (Math.random() * 150 + 250);
			this.nom=nombre;
			this.energia= 100;
			this.vida= vidaa;
			this.danybase=20;
			this.defensa=15;
			this.precisio=72;
			this.vidaperm=vidaa;
			this.tipo_pokemon=tipo;
		}
		else if(tipo.equals("electric")) {
			int vidaa = (int) (Math.random() * 150 + 250);
			this.nom=nombre;
			this.energia= 100;
			this.vida= vidaa;
			this.danybase=25;
			this.defensa=15;
			this.precisio=63;
			this.vidaperm=vidaa;
			this.tipo_pokemon=tipo;
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
	public int getVidaPerm() {
		return this.vidaperm;
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
	public void setVidaPerm(int a) {
		this.vidaperm=a;
	}
	@Override
	public String toString() {
		return(this.tipo_pokemon + " || Nom: " + this.nom+", " + "Energia: " + this.energia + ", " + 
			"Vida: " + this.vida+ ", "+ "Dany: " + this.danybase+ ", "+ 
				"Defensa: " + this.defensa+ ", " + "Precisió: " + this.precisio);
	}
	@Override
	public int compareTo(Pokemon p1) {
		return p1.getVida() - this.getVida();
	}
}
