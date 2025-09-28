package ed.exercicios.array.lista1;
import java.util.Scanner;

public class Quest13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float[] temp = new float[12];
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        float mediaTemp = 0;

        System.out.println("-----Digite as médias de temperatura dos meses-----");
        for(int i = 0; i < temp.length; i++){
            System.out.print(mes[i] + ": ");
            temp[i] = scanner.nextInt();
            mediaTemp += temp[i];
        }
        mediaTemp = mediaTemp / 12;

        System.out.printf("\nMédia anual de temperatura: %.2f°C\n", mediaTemp);
        System.out.println("Meses com temperatura acima da média anual:");

        for (int i = 0; i < 12; i++) {
            if (temp[i] > mediaTemp) {
                System.out.printf("%d - %s: %.2f°C\n", i + 1, mes[i], temp[i]);
            }
        }

        scanner.close();
    }
}
