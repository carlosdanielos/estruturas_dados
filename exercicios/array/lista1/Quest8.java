package ed.exercicios.array.lista1;

import java.util.Scanner;

public class Quest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idade = new int[5];
        int[] altura = new int[5];

        System.out.println("Digite os dados das pessoas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Idade da " + (i + 1) + "ª pessoa: ");
            idade[i] = scanner.nextInt();
            System.out.print("Altura da " + (i + 1) + "ª pessoa (em centímetros): ");
            altura[i] = scanner.nextInt();
        }

        System.out.println("\n---- Ordem inversa das respostas ----");
        for (int i = 4; i >= 0; i--) {
            System.out.println((i + 1) + "ª pessoa:");
            System.out.println("Idade: " + idade[i]);
            System.out.println("Altura: " + altura[i] + " cm");
        }

        scanner.close();
    }
}
