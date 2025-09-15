package ed.array.lista1;
import java.util.Scanner;

public class Quest12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] idade = new int[30];
        int[] altura = new int[30];
        float mediaAltura = 0;
        int cont = 0;

        for(int i = 0; i < 30; i++){
            System.out.print("Idade da " + (i + 1) + "ª pessoa: ");
            idade[i] = scanner.nextInt();
            System.out.print("Altura da " + (i + 1) + "ª pessoa (cm): ");
            altura[i] = scanner.nextInt();

            mediaAltura += altura[i];
        }

        mediaAltura = mediaAltura/30;
        for(int i = 0; i < 30; i++){
            if(idade[i] > 13 && altura[i] < mediaAltura){
                cont++;
            }
        }

        System.out.println("Total de pessoas com mais de 13 anos e altura menor que a media de " + mediaAltura + " cm: " + cont);

        scanner.close();
    }
}
