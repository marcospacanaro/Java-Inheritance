package HerancaEncapsulamento;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa () {
		
	}
	
	public Pessoa (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;           // THIS. serve para não atribuir "apelidos"//
		this.telefone = telefone;           //  aos atributos //
	}
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	// GETTERS E SETTERS = MÉTODOS DE ENCAPSULAMENTO //
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
