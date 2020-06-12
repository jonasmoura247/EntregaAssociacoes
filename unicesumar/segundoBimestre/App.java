package unicesumar.segundoBimestre;

public class App {

	public static void main(String[] args) {

		Sorvete sorvete = new Sorvete();

		Cobertura cobertura = new Cobertura(sorvete);

		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("Cobertura do Sorvete: " + sorvete.getCobertura());
		System.out.println("Sorvete da cobertura: " + cobertura.getSorvete());
		sorvete.setCobertura(cobertura);
		System.out.println(cobertura);
		// Definições de sabores dos sorvetes e o nome da sorveteria
		Estoque estoque = new Estoque("Sorveteria URSO POLAR");
		Estoque sabor1 = new Estoque("Chocolate");
		Estoque sabor2 = new Estoque("Blue sky");
		Estoque sabor3 = new Estoque("chiclete");
		Estoque sabor4 = new Estoque("torta alemã");

		Estoque[] sabores = { sabor1, sabor2, sabor3, sabor4 };

		SaborDisponivel saborDisponivel = new SaborDisponivel(estoque, sabores);
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println(saborDisponivel.getDisponivel().getNome());
		for (Estoque sabor : saborDisponivel.getSabores()) {
			System.out.println("  " + sabor.getNome());
		}
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");

		// sabores sorvete
		Picole picole = new Picole("Limao");
		Picole picole1 = new Picole("Chocolate");
		Picole picole2 = new Picole("morango");
		Picole picole3 = new Picole("leite ninho");
		Picole picole4 = new Picole("uva");

		Picole[] saborPicole = { picole, picole1, picole2, picole3, picole4 };
		// marcas soverte
		Marcas marcas = new Marcas("Garoto");
		Marcas marcas1 = new Marcas("kibom");
		Marcas marcas2 = new Marcas("nescau");
		Marcas marcas3 = new Marcas("gela boca");
		Marcas marcas4 = new Marcas("Lacta");

		Marcas[] marcasPicole = { marcas, marcas1, marcas2, marcas3, marcas4 };

		picole.setMarca(marcasPicole);
		marcas.setPicole(saborPicole);

		// apresenta as marcas e os sabores
		System.out.println(marcas.getMarca());
		for (Picole sabor : marcas.getSaboresPicole()) {
			System.out.println("  " + sabor.getSaborPicole());
		}

		System.out.println(picole.getSaborPicole());
		for (Marcas marca : picole.getMarcasPicole()) {
			System.out.println("  " + marca.getMarca());
		}
	}
}
