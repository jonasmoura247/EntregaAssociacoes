package unicesumar.segundoBimestre;

import java.util.HashSet;

public class Marcas {
	private String marca;
	HashSet<Picole> saboresPicole = new HashSet<>();

	public Marcas(String nomeMarca) {
		this.marca = nomeMarca;
	}

	public void setPicole(Picole[] sabores) {

		for (Picole sabor : sabores) {
			this.saboresPicole.add(sabor);
		}
	}

	public String getMarca() {
		return marca;
	}

	public HashSet<Picole> getSaboresPicole() {
		return saboresPicole;
	}

}
