package ed.I_Unidade.exercicios.array.lista1;

import java.util.Scanner;

public class Quest11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        int[] result = new int[30];


        System.out.println("-----Digite os 10 primeiros números-----");
        for(int i = 0; i < array1.length; i++){
            System.out.print((i + 1) + "º número: ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("-----Digite outros 10 números-----");
        for(int i = 0; i < array1.length; i++){
            System.out.print((i + 1) + "º número: ");
            array2[i] = scanner.nextInt();
        }

        System.out.println("-----Digite os últimos 10 números-----");
        for(int i = 0; i < array1.length; i++){
            System.out.print((i + 1) + "º número: ");
            array3[i] = scanner.nextInt();
        }

        int k = 0;
        for(int i = 0; i < 10; i++){
            result[k++] = array1[i];
            result[k++] = array2[i];
            result[k++] = array3[i];
        }

        System.out.println("-----Resultado-----");
        System.out.print("[");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            if (i != result.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}