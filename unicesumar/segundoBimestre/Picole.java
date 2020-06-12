package unicesumar.segundoBimestre;

import java.util.HashSet;

public class Picole {
	private String saborPicole;
	HashSet<Marcas> marcasPicole = new HashSet<>();

	public Picole(String sabor) {
		this.saborPicole = sabor;

	}

	public void setMarca(Marcas[] marcas) {

		for (Marcas marca : marcas) {
			this.marcasPicole.add(marca);
		}
	}

	public String getSaborPicole() {
		return saborPicole;
	}

	public HashSet<Marcas> getMarcasPicole() {
		return marcasPicole;
	}
}