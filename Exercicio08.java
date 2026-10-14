// Nome: Nicollas Nogueira Fernandes
// RA: 1252625635

import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aluno = 1;
        while (aluno <= 5) {
            double nota1, nota2;
            do {
                System.out.print("Aluno " + aluno + " - primeira nota (0 a 10): ");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);
            do {
                System.out.print("Aluno " + aluno + " - segunda nota (0 a 10): ");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);
            double media = (nota1 + nota2) / 2;
            System.out.println("Media do aluno " + aluno + ": " + media);
            aluno++;
        }
        entrada.close();
    }
}
