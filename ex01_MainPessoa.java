package HerancaEncapsulamento;
import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Scanner sc = new Scanner (System.in);
		
		String nomePessoa;
		
		// usando o set: preenche variável com valores.
		
		System.out.println("Informe o nome: ");
		nomePessoa = sc.nextLine();
		pessoa1.setNome(nomePessoa);
		
		pessoa1.setEndereco("São Paulo | ");
		pessoa1.setTelefone("(11) 971915994 ");
		
		// usando o get: retorna os valores preenchidos.
		
		pessoa1.getNome();
		pessoa1.getEndereco();
		pessoa1.getTelefone();
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getTelefone());
		
	}

}
