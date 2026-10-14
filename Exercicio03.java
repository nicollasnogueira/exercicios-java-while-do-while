// Nome: Nicollas Nogueira Fernandes
// RA: 1252625635

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int limite = entrada.nextInt();
        long numero = 1;
        while (numero <= limite) {
            System.out.println(numero);
            numero = numero * 2;
        }
        entrada.close();
    }
}
