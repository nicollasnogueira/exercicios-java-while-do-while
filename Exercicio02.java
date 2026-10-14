// Nome: Nicollas Nogueira Fernandes
// RA: 1252625635

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1, pares = 0, impares = 0;
        while (contador <= 10) {
            System.out.print("Digite o " + contador + " numero: ");
            int numero = entrada.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contador++;
        }
        System.out.println("O total de pares e: " + pares);
        System.out.println("O total de impares e: " + impares);
        entrada.close();
    }
}
