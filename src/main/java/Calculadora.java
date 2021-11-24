import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser investido: ");
        double valor = scanner.nextDouble();


        System.out.println("Digite a quantidade de semanas: ");
        int tempo = scanner.nextInt();

        scanner.close();

        double resultado = valor * Math.pow((1 + 4.25), tempo)/252;

        System.out.println("O valor resultante do investimento é: " + resultado);

    }
}
