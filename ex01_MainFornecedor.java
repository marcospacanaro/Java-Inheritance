package HerancaEncapsulamento;
import java.util.Scanner;

public class MainFornecedor {

    public static void main(String[] args) {

        String nomePessoa, endeco, telefone;
        double divida, credito;
        Fornecedor f = new Fornecedor();
        Scanner sc = new Scanner(System.in);

        System.out.println(" ---------------------- EXERCICIO 2 --------------");

        System.out.println("Informe o nome: ");
        nomePessoa = sc.nextLine();
        f.setNome(nomePessoa);

        System.out.println("Informe o Endereço: ");
        endeco = sc.nextLine();
        f.setEndereco(endeco);

        System.out.println("Informe o telefone: ");
        telefone = sc.nextLine();
        f.setTelefone(telefone);

        System.out.println("Informe o valor da divida: ");
        divida = sc.nextDouble();
        f.setValorDivida(divida);
        System.out.println("Informe o valor do credito: ");
        credito = sc.nextDouble();
        f.setValorCredito(credito);

        System.out.println(" ---------------- USANDO OS GETTERS E O METODO obterSaldo () ------------");

        System.out.println(f.getNome());
        System.out.println(f.getEndereco());
        System.out.println(f.getTelefone());
        System.out.println(f.getValorCredito());
        System.out.println(f.getValorDivida());

        System.out.println("");
        f.obterSaldo();

    }

}