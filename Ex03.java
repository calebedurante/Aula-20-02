
public class Ex03 {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(32);
		Circulo c2 = new Circulo(44);
		Circulo c3 = new Circulo(17);
		
		c1.calcularArea();
		c1.calcularPerimetro();
		c2.calcularArea();
		c2.calcularPerimetro();
		c3.calcularArea();
		c3.calcularPerimetro();
		
		
		
		Funcionario f1 = new Funcionario("João", 20, 3.5);
		Funcionario f2 = new Funcionario("Matheus", 40, 5.5);
		Funcionario f3 = new Funcionario("Lucas", 40, 13.5);
		
		f1.calcularsalario();
		f2.calcularsalario();
		f3.calcularsalario();
	}

}
