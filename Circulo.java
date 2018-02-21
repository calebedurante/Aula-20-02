public class Circulo {

	private int raio;
	
	public Circulo(int raio) {
		super();
		this.raio = raio;
	}
	
	double calcularArea() {
		return (raio*raio)*Math.PI;
	}
	
	double calcularPerimetro() {
		return 2*raio*Math.PI;
	}
	
}
