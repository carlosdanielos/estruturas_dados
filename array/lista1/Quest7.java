package ed.array.lista1;

import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        int soma = 0;
        int mult = 1;

        System.out.println("Digite os 5 números desejados: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + "º número: ");
            num[i] = scanner.nextInt();

            soma += num[i];
            mult *= num[i];
        }

        System.out.println("---- Resultados ----");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);

            if (i != num.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Soma dos números: " + soma);
        System.out.println("Produto dos números: " + mult);

        scanner.close();
    }
}
