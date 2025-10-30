package ed.II_Unidade.pilha.exercicio_carro.dao;

import ed.II_Unidade.pilha.DoubleNode;
import ed.II_Unidade.pilha.LinkedStack;
import ed.II_Unidade.pilha.exercicio_carro.model.Car;
import ed.II_Unidade.pilha.Stackable;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;


/**
 * Implementação do DAO para gerenciamento de um estacionamento utilizando estrutura de dados do tipo pilha.
 *
 * @author Carlos Daniel Oliveira Silva
 * @since 2025-10-21
 */
public class CarDaoLinkedStack implements CarDAO{

    private Stackable<Car> stackCars = new LinkedStack<>(20);


    // Operações básicas CRUD

    /**
     * Adiciona um carro ao estacionamento.
     *
     * @param car o carro a ser adicionado
     * @throws NoSuchElementException se a pilha estiver cheia
     */
    @Override
    public void addCar(Car car) {
        if(isParkingFull()){
            throw new NoSuchElementException("Parking is full!");
        }
        stackCars.push(car);
    }

    /**
     * Busca um carro pela sua placa.
     *
     * O método desempilha a pilha em busca de um carro com a placa informada.
     * Após a busca, a pilha retorna para sua forma original.
     *
     * @param plateLicense a placa do carro a ser encontrado
     * @return o livro encontrado ou null caso o carro não exista
     */
    @Override
    public Car getCar(String plateLicense) {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty!");
        }
        Stackable<Car> auxStack = new LinkedStack<>(20);
        Car resultCar = null;
        while(!stackCars.isEmpty()){
            Car car = stackCars.pop();
            auxStack.push(car);

            if(car.getLicensePlate().equals(plateLicense)){
                resultCar = car;
                break;
            }
        }

        while (!auxStack.isEmpty()){
            Car car = auxStack.pop();
            stackCars.push(car);
        }

        return resultCar;
    }

    /**
     * Informa todos os carros do estacionamento.
     *
     * @return array contendo todos os carross do estacionamento.
     */
    @Override
    public Car[] getAllCars() {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty!");
        }

        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void updateCar(Car newCar) {
        stackCars.update(newCar);
    }

    @Override
    public Car deleteCar(String plateLicense) {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty!");
        }
        Stackable<Car> auxStack = new LinkedStack<>(20);
        Car resultCar = null;

        while(!stackCars.isEmpty()){
            Car car = stackCars.pop();
            if(car.getLicensePlate().equals(plateLicense)){
                resultCar = car;
                break;
            } else{
                auxStack.push(car);
            }
        }

        while(!auxStack.isEmpty()) {
            stackCars.push(auxStack.pop());
        }

        return resultCar;
    }

    // Operações de consulta específicas para carros
    @Override
    public Car getCarByLicensePlate(String licensePlate) {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty!");
        }
        Stackable<Car> auxStack = new LinkedStack<>(20);
        Car resultCar = null;

        while(!stackCars.isEmpty()){
            Car car = stackCars.pop();
            auxStack.push(car);

            if(car.getLicensePlate().equals(licensePlate)) {
                resultCar = car;
                break;
            }
        }

        while(!auxStack.isEmpty()) {
            stackCars.push(auxStack.pop());
        }

        return resultCar;
    }

    @Override
    public Car[] getCarsByMark(String mark) {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty!");
        }

        Stackable<Car> auxStack = new LinkedStack<>(20);
        Car[] search = new Car[countElements(stackCars)];
        int index = 0;
        while (!stackCars.isEmpty()){
            Car car = stackCars.pop();
            auxStack.push(car);

            if(car.getMark().equals(mark)){
                search[index] = car;
            }

            index++;
        }

        while(!auxStack.isEmpty()) {
            stackCars.push(auxStack.pop());
        }

        return search;
    }

    @Override
    public Car[] getCarsByModel(String model) {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty!");
        }

        Stackable<Car> auxStack = new LinkedStack<>(20);
        Car[] search = new Car[countElements(stackCars)];
        int index = 0;
        while (!stackCars.isEmpty()){
            Car car = stackCars.pop();
            auxStack.push(car);

            if(car.getMark().equals(model)){
                search[index] = car;
            }

            index++;
        }

        while(!auxStack.isEmpty()) {
            stackCars.push(auxStack.pop());
        }

        return search;
    }

    @Override
    public Car[] getCarsByColor(String color) {
        if(isParkingFull()){
            throw new NoSuchElementException("Parking is empty!");
        }

        Stackable<Car> auxStack = new LinkedStack<>(20);
        Car[] search = new Car[countElements(stackCars)];
        int index = 0;
        while (!stackCars.isEmpty()){
            Car car = stackCars.pop();
            auxStack.push(car);

            if(car.getMark().equals(color)){
                search[index] = car;
            }

            index++;
        }

        while(!auxStack.isEmpty()) {
            stackCars.push(auxStack.pop());
        }

        return search;
    }

    @Override
    public Car[] getCarsByOwner(String owner) {
        if(isParkingFull()){
            throw new NoSuchElementException("Parking is empty!");
        }

        Stackable<Car> auxStack = new LinkedStack<>(20);
        Car[] search = new Car[countElements(stackCars)];
        int index = 0;
        while (!stackCars.isEmpty()){
            Car car = stackCars.pop();
            auxStack.push(car);

            if(car.getMark().equals(owner)){
                search[index] = car;
            }

            index++;
        }

        while(!auxStack.isEmpty()) {
            stackCars.push(auxStack.pop());
        }

        return search;
    }

    @Override
    public Car[] getCarsByMomentArrival(LocalDateTime initialMoment, LocalDateTime finalMoment) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de análise e estatísticas
    @Override
    public Car getCarByNewestArrival() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car getCarByOldestArrival() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de relatório e estatísticas
    @Override
    public String printCars() {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty!");
        }
        String result = "";

        Stackable<Car> auxStack = new LinkedStack<>(20);
        while(!stackCars.isEmpty()){
            Car car = stackCars.pop();
            result += car + "\n";
            auxStack.push(car);
        }

        while (!auxStack.isEmpty()){
            stackCars.push(auxStack.pop());
        }

        return result;
    }

    @Override
    public int getTotalCars() {
        return countElements(stackCars);
    }

    @Override
    public String getMostPopularMark() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public String getMostPopularModel() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public String getMostPopularColor() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de gerenciamento
    @Override
    public boolean isCarInPlaced(String plateLicense) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void clearAllCars() {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty");
        }
        while (!stackCars.isEmpty()){
            stackCars.pop();
        }
    }

    @Override
    public void removeCarsOlderThan(LocalDateTime date) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByParkingDuration(long minHours, long maxHours) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getAvailableSpaces() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public boolean isParkingEmpty() {
        return stackCars.isEmpty();
    }

    @Override
    public int getMaxCapacity() {
        return 20;
    }

    @Override
    public int getOccupancyRate() {
        return countElements(stackCars) * 100 / getMaxCapacity();
    }

    @Override
    public boolean isParkingFull() {
        return stackCars.isFull();
    }

    @Override
    public long getParkingDuration(String plateLicense) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void removeCarsByOwner(String owner) {
        if(isParkingEmpty()){
            throw new NoSuchElementException("Parking is empty!");
        }

        Stackable<Car> auxStack = new LinkedStack<>(20);
        while(!stackCars.isEmpty()){
            Car car = stackCars.pop();
            if (!car.getOwnerName().equals(owner)) {
                auxStack.push(car);
            }
        }

        while(!auxStack.isEmpty()){
            stackCars.push(auxStack.pop());
        }
    }

    @Override
    public long getAverageArrivalTime() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsWithLongParking(long thresholdHours) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    private Car[] stackToArray(Stackable<Car> stack){
        Car[] arrayCar = new Car[countElements(stack)];
        LinkedStack<Car> auxStack = new LinkedStack<>(20);
        int index = 0;
        while(!stackCars.isEmpty()){
            Car car = stackCars.pop();
            auxStack.push(car);
            arrayCar[index] = car;
        }

        return arrayCar;
    }

    private int countElements(Stackable<Car> stack) {
        LinkedStack<Car> auxStack = new LinkedStack<>(20);
        int count = 0;
        while(!stackCars.isEmpty()){
            Car car = stackCars.pop();
            auxStack.push(car);
            count++;
        }

        while(!auxStack.isEmpty()){
            Car car = auxStack.pop();
            stackCars.push(car);
        }

        return count;
    }
}
