package ed.array.lista1;

import java.util.Scanner;

public class Quest9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];
        int somaDosQuadrados = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + "º número: ");
            num[i] = scanner.nextInt();
            somaDosQuadrados += num[i] * num[i];
        }

        System.out.println("\nA soma dos quadrados dos números é: " + somaDosQuadrados);

        scanner.close();
    }
}
