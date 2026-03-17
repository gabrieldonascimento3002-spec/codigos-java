import java.util.ArrayList;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<itempedido> itens = new ArrayList<>();

        int opcao;

        do {
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Adicionar item");
            System.out.println("3 - Listar clientes");
            System.out.println("4 - Listar itens");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                Cliente c = new Cliente();

                System.out.print("Nome: ");
                c.nome = sc.nextLine();

                System.out.print("ID: ");
                c.id = sc.nextLine();

                System.out.print("Endereço: ");
                c.endereco = sc.nextLine();

                clientes.add(c);
            }

            else if (opcao == 2) {
                itempedido i = new itempedido();

                System.out.print("Produto: ");
                i.nomeProduto = sc.nextLine();

                System.out.print("Quantidade: ");
                i.quantidade = sc.nextInt();

                System.out.print("Valor unitario: ");
                i.valorUnitario = sc.nextDouble();
                sc.nextLine();

                itens.add(i);
            }

            else if (opcao == 3) {
                for (Cliente c : clientes) {
                    System.out.println("Nome do cliente: " + c.nome + " - ID: " + c.id + " - Endereço: " + c.endereco);
                }
            }

            else if (opcao == 4) {
                for (itempedido i : itens) {
                    System.out.println("Produto: " + i.nomeProduto + " -Quantidade " + i.quantidade + " -Valor unitario: " + i.valorUnitario + " - Total: " + (i.quantidade * i.valorUnitario));
                }
            }

        } while (opcao != 0);
        sc.close();
    }
}