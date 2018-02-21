
public class Pessoa {

	private String nome, cpf;
	private int idade;
	
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Calebe", "000.000.000-01", 15);
		Pessoa p2 = new Pessoa("Oi", "000.000.000-01", 19);
		
		System.out.println("Nome: " + p1.getNome() + " CPF: " + p1.getCpf() + " Idade: " + p1.getIdade());
		System.out.println("Nome: " + p2.getNome() + " CPF: " + p2.getCpf() + " Idade: " + p2.getIdade());
		
		p1.setCpf("111.111.111-01");
		p1.setNome("amanda");
		p1.setIdade(10);
		
		p2.setNome("calebe");
		p2.setCpf("111.111.111-11");
		p2.setIdade(10);
		
		System.out.println("Nome: " + p1.getNome() + " CPF: " + p1.getCpf() + " Idade: " + p1.getIdade());
		System.out.println("Nome: " + p2.getNome() + " CPF: " + p2.getCpf() + " Idade: " + p2.getIdade());
		
		
	}
	
}
