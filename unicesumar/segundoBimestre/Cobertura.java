package unicesumar.segundoBimestre;

public class Cobertura {
	private Sorvete sorvete;
	
	public Cobertura(Sorvete sorvete) {
		if (sorvete == null) {
			throw new RuntimeException("Para usar cobertura primeiro compre um sorvete!");
		}
		this.sorvete = sorvete;
		this.sorvete.setCobertura(this);
		
	}
	public Sorvete getSorvete() {
		return sorvete;
	}
}
