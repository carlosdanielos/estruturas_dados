package ed.I_Unidade.provas.semestre2025_1;

import ed.I_Unidade.pilha.pilhaSimples.ArrayStack;


public class Questao2 {
    public String decToBin(String data){
        int dividendo = Integer.parseInt(data);

        if(dividendo == 0){
            return "0";
        }

        ArrayStack pilha = new ArrayStack(32);
        while(dividendo != 0){
            int resto = dividendo % 2;
            int quociente = dividendo / 2;
            dividendo = quociente;

            pilha.push(resto);
        }
        return pilha.print();
    }

    public static void main(String[] args){
        Questao2 quest = new Questao2();
        String resultado = quest.decToBin("10");
        System.out.println(resultado);
    }
}

class Questao3{

    public enum Order{
        ASCENDING,
        DESCENDING;
    }

    public void sort(Order by, int[] data){
        for(int i = 0; i < data.length - 1; i++){
            for(int j = i + 1; j < (data.length - 1) - i; j++){
                if((by == Order.ASCENDING && data[i] > data[j]) ||
                        (by == Order.DESCENDING && data[i] < data[j])){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}

