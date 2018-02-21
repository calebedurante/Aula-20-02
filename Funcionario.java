
public class Funcionario {
	
	private String nome;
	private double horastrab,valorhora;
	
	public Funcionario(String nome, double horastrab, double valorhora) {
		super();
		this.nome = nome;
		this.horastrab = horastrab;
		this.valorhora = valorhora;
	}
	
	double calcularsalario() {
		return valorhora*horastrab;
	}
	
}
