package ed.array.lista1;
import java.util.Scanner;

public class Quest3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float[] array = new float[4];
        float media = 0;

        for(int i = 0; i< array.length; i++){
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            array[i] = sc.nextInt();
        }
        
        System.out.println("----- Média -----");
        for(int i = 0; i < array.length; i++){
            media += array[i];
        }

        for(int i=0; i<array.length; i++){
            System.out.println("Nota " + (i+1) + ": " + array[i]);
        }
        media = media / array.length;
        System.out.println("Média Final: " + media);
        
    }
}