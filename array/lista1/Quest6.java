package ed.array.lista1;

import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int[] array1 = new int[10];
        int quantAprovado = 0;

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Digite as notas do " + (i + 1) + "º aluno:");

            System.out.print("1ª nota: ");
            nota1 = scanner.nextInt();

            System.out.print("2ª nota: ");
            nota2 = scanner.nextInt();

            System.out.print("3ª nota: ");
            nota3 = scanner.nextInt();

            System.out.print("4ª nota: ");
            nota4 = scanner.nextInt();

            array1[i] = (nota1 + nota2 + nota3 + nota4) / 4;
        }

        System.out.print("[");

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);

            if (i < array1.length - 1) {
                System.out.print(", ");
            }

            if (array1[i] >= 7) {
                quantAprovado++;
            }
        }

        System.out.println("]");
        System.out.println("QuantAprovado = " + quantAprovado + " alunos foram aprovados!");

        scanner.close();
    }
}
