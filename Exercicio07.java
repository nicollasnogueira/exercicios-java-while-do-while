import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1, dentroDaFaixa = 0;
        while (contador <= 10) {
            System.out.println("Pessoa " + contador);
            System.out.print("Digite o peso em kg: ");
            double peso = entrada.nextDouble();
            System.out.print("Digite a altura em metros: ");
            double altura = entrada.nextDouble();
            if (peso <= 0 || altura <= 0) {
                System.out.println("Peso e altura devem ser positivos. Tente novamente.");
                continue;
            }
            double imc = peso / (altura * altura);
            System.out.println("IMC: " + imc);
            if (imc >= 18.5 && imc <= 24.9) {
                dentroDaFaixa++;
            }
            contador++;
        }
        System.out.println("Pessoas com IMC entre 18,5 e 24,9: " + dentroDaFaixa);
        entrada.close();
    }
}
