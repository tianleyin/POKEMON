package pokemons;
import java.util.Comparator;
public abstract class Pokemon implements Comparator<Pokemon> {
	private String nom;
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
	@Override
	public int compare(Pokemon p1, Pokemon p2) {
		return p1.getVida() - p2.getVida();
	}
}
