package task.lesson10.two;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private int numberCarCarage;
    Map<Car, Integer> carGarage = new HashMap<>();

    public void parked(Map<Car, Integer> carGarage, Car car) {
        if (!(carGarage.containsKey(car))) {
            carGarage.put(car, 1);
        } else {
            carGarage.put(car, carGarage.get(car) + 1);
        }
    }

    public void departure(Map<Car, Integer> carGarage, Car car) {
        this.numberCarCarage = carGarage.get(car);
        if (carGarage.get(car) > 0) {
            carGarage.remove(car);
            carGarage.put(car, getNumberCarCarage() - 1);
        }
    }

    public int getQualityCar(Map<Car, Integer> carCarage, Car car) {
        return carCarage.get(car);
    }

    public int getNumberCarCarage() {
        return numberCarCarage;
    }

    public void setNumberCarCarage(int numberCarCarage) {
        this.numberCarCarage = numberCarCarage;
    }
}