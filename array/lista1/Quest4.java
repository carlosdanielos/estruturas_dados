package ed.array.lista1;
import java.util.Scanner;

public class Quest4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        char[] array = new char [10];
        int consoante = 0;

        System.out.println("Digite os 10 caracteres desejados: ");
        for(int i = 0; i < array.length; i++){
            System.out.println((i + 1) + "º caractere: ");
            array[i] = scanner.next().charAt(0);
        }


        System.out.println("Consoantes encontradas: ");
        for (int i = 0; i < array.length; i++){
            char c = Character.toLowerCase(array[i]);
            if (c >= 'a' && c <= 'z' &&
                    c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {

                System.out.print(array[i] + " ");
                consoante++;
            }
        }
        System.out.println("\nTotal de consoantes: " + consoante);


    }
}