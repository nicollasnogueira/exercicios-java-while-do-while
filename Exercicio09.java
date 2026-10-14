// Nome: Nicollas Nogueira Fernandes
// RA: 1252625635

import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double totalCompra = 0;
        int continuar;
        do {
            System.out.println("1 - Cachorro quente: R$ 1,20");
            System.out.println("2 - Bauru simples: R$ 1,30");
            System.out.println("3 - Bauru com ovo: R$ 1,50");
            System.out.println("4 - Hamburguer: R$ 1,20");
            System.out.println("5 - Cheeseburguer: R$ 1,30");
            System.out.println("6 - Refrigerante: R$ 1,00");
            System.out.print("Digite o codigo do produto: ");
            int codigo = entrada.nextInt();
            double preco = 0;
            if (codigo == 1) preco = 1.20;
            else if (codigo == 2) preco = 1.30;
            else if (codigo == 3) preco = 1.50;
            else if (codigo == 4) preco = 1.20;
            else if (codigo == 5) preco = 1.30;
            else if (codigo == 6) preco = 1.00;
            if (preco > 0) {
                System.out.print("Digite a quantidade: ");
                int quantidade = entrada.nextInt();
                if (quantidade > 0) {
                    double subtotal = preco * quantidade;
                    System.out.printf("Valor do produto: R$ %.2f%n", subtotal);
                    totalCompra += subtotal;
                } else {
                    System.out.println("Quantidade invalida.");
                }
            } else {
                System.out.println("Codigo invalido.");
            }
            System.out.print("Deseja continuar? (1 - sim, 0 - nao): ");
            continuar = entrada.nextInt();
        } while (continuar == 1);
        System.out.printf("Total da compra: R$ %.2f%n", totalCompra);
        entrada.close();
    }
}
