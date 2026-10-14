import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int menor = 0;
        while (contador <= 10) {
            int numero;
            do {
                System.out.print("Digite o " + contador + " numero positivo: ");
                numero = entrada.nextInt();
            } while (numero <= 0);
            if (contador == 1 || numero < menor) {
                menor = numero;
            }
            contador++;
        }
        System.out.println("O menor numero e: " + menor);
        entrada.close();
    }
}
