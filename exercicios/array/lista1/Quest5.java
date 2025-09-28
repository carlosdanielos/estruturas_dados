package ed.exercicios.array.lista1;
import java.util.Scanner;

public class Quest5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[20];
        int contPar = 0;
        int contImpar = 0;

        System.out.println("Digite os 20 números desejados: ");
        for(int i = 0; i < num.length; i++){
            System.out.println((i + 1) + "º número: ");
            num[i] = scanner.nextInt();
            if(num[i] % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
        }

        int[] par = new int[contPar];
        int[] impar = new int[contImpar];

        contPar = 0;
        contImpar = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                par[contPar] = num[i];
                contPar++;
            }else{
                impar[contImpar] = num[i];
                contImpar++;
            }
        }

        //exibição do vetor inteiro
        System.out.println("\n-----Vetor principal-----");
        System.out.print("[");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if(i != num.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //exibição dos números pares
        System.out.println("\n-----Vetor de números pares-----");
        System.out.print("[");
        for(int i = 0; i < par.length; i++){
            System.out.print(par[i]);
            if(i != par.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Total de números pares: " + contPar);

        //exibição dos números ímpares
        System.out.println("\n-----Vetor de números pares-----");
        System.out.print("[");
        for(int i = 0; i < impar.length; i++){
            System.out.print(impar[i]);
            if(i != impar.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Total de números pares: " + contPar);

    }
}