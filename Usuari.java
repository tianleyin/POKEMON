package pokemons;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuari {
	private String alies;
	ArrayList<Pokemon> equipo = new ArrayList<Pokemon>(6);
	
	Usuari() {
		
	}
	
	public String getAlies() {
		return alies;
	}
	
	public void setAlies() {
		this.alies = alies;
	}
	
}
