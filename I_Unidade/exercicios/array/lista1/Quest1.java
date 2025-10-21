package ed.I_Unidade.exercicios.array.lista1;
import java.util.Scanner;


public class Quest1{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        for(int i = 0; i< array.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            array[i] = sc.nextInt();
        }

        System.out.println("----- Números Digitados -----");
        for(int i=0; i< array.length; i++){
            System.out.println("Posição " + i + ": " + array[i]);
        }

    }
}