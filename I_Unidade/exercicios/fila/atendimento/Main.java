package ed.I_Unidade.exercicios.fila.atendimento;

public class Main{
    public static void main(String[] args){

        Service service = new Service(10);

        service.addCostumer("Patric");
        service.addCostumer("Isçahn");
        service.addCostumer("Geovani");
        System.out.println(service.print());

        service.serveCostumer();
        System.out.println(service.print());

        service.addCostumer("Daniel");
        System.out.println(service.print());

        service.serveCostumer();
        System.out.println(service.print());

    }
}