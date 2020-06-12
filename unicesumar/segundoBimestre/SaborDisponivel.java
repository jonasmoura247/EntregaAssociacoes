package unicesumar.segundoBimestre;

import java.util.HashSet;

public class SaborDisponivel {
	private Estoque disponivel;
	private HashSet<Estoque> sabores = new HashSet<>();

	public SaborDisponivel(Estoque disponivel, Estoque[] sabores) {
		if (disponivel == null) {
			throw new RuntimeException("O estoque esta zerado, por favor reabasteça...");
		}
		this.disponivel = disponivel;

		for (Estoque sabor : sabores) {
			this.sabores.add(sabor);
		}

	}

	public Estoque getDisponivel() {
		return disponivel;
	}

	public HashSet<Estoque> getSabores() {
		return sabores;
	}

	public String getEstoque() {

		return disponivel.getNome();
	}

}
