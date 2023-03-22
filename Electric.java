package pokemons;

import java.util.ArrayList;

public class Electric extends Pokemon implements Atacable, Defensable{
	private String nombre;
	private int vida, ataquee;

	public Electric (String nombre, int vida) {
		super("electric",nombre, vida);
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

	ArrayList<String> elec_ataque = new ArrayList<String>() {{ add("BOLA_VOLTIO"); add("XISPA"); }};

	@Override
	public int getAtac() {
		int ataque = (int) (Math.random() * 4);
		String atac = elec_ataque.get(ataque);
		int num_aleatorio = (int) (Math.random() * 60 + 30) ; 
		if ("BOLA_VOLTIO".equals(atac)) {
			this.ataquee = 12;
		}
		else if ("XISPA".equals(atac)) {
			this.ataquee = 7;
		}
		this.setEnergia(getEnergia() - 20);
		return 25 + num_aleatorio + ataquee;
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
