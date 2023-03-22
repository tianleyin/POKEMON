package pokemons;

import java.util.ArrayList;

public class Aigua extends Pokemon implements Atacable, Defensable{
	private String nombre;
	private int vida, ataquee;

	public Aigua (String nombre, int vida) {
		super("aigua",nombre, vida);
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	ArrayList<String> elec_ataque = new ArrayList<String>() {{ add("PISTOLA_AIGUA"); add("HIDROBOMBA"); add("RAIG_BOMBOLLA");}};


	@Override
	public int getAtac() {
		int ataque = (int) (Math.random() * 4);
		String atac = elec_ataque.get(ataque);
		int num_aleatorio = (int) (Math.random() * 60 + 30) ; 
		if ("PISTOLA_AIGUA".equals(atac)) {
			this.ataquee = 7;
		}
		else if ("HIDROBOMBA".equals(atac)) {
			this.ataquee = 13;
		}
		else if ("RAIG_BOMBOLLA".equals(atac)) {
			this.ataquee = 5;
		}
		this.setEnergia(getEnergia() - 15);
		return 15 + num_aleatorio + ataquee;
	}

	@Override 
	public String getDefensa(Pokemon enemic, int atacEnemic) {
		return "0";
	}

	@Override
	public int compareTo(Pokemon p) {
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
