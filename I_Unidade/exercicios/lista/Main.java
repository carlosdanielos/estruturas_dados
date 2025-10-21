package ed.I_Unidade.exercicios.lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da lista: ");
        int length = scanner.nextInt();
        ArrayList lista = new ArrayList(length);

        boolean op = true;
        while(op){
            System.out.println("1 - Adicionar item no fim\n" +
                                "2 - Adicionar item no meio\n" +
                                "3 - Deletar item no meio\n" +
                                "4 - Excluir lista completa\n" +
                                "5 - Listar\n" +
                                "0 - Encerrar operação");
            int num = scanner.nextInt();
            switch (num){
                case 0:
                    op = false;
                    break;
                case 1:
                    System.out.println("Informe o dado a ser inserido:");
                    String data1 = scanner.next();
                    lista.append(data1);
                    break;
                case 2:
                    System.out.println("Informe o dado a ser inserido:");
                    String data2 = scanner.next();
                    System.out.println("Informe onde o dado será inserido:");
                    int index1  = scanner.nextInt();
                    lista.insert(data2, index1);
                    break;

                case 3:
                    System.out.println("Informe o índice a ser deletado:");
                    int index3 = scanner.nextInt();
                    lista.delete(index3);
                    break;

                case 4:
                    lista.clear();
                    break;

                case 5:
                    System.out.println(lista.print());
                    break;

                default:
                    System.err.println("Opção inválida!");
                    break;

            }
        }
    }
}
