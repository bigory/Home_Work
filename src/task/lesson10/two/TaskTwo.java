package task.lesson10.two;

public class TaskTwo {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Sedan sedan = new Sedan("Toyota", "Camry", 2008, "Black", 2.4);
        Sedan sedan1 = new Sedan("Toyota", "Camry", 2006, "Black", 2.4);
        Universal universal = new Universal("Vw", "Passat", 2008, "black", 2.4);
        Coupe coupe = new Coupe("Bmw", "Z5", 2000, "Red", 3.0);
        Coupe coupe1 = new Coupe("Bmw", "M6", 2000, "Red", 3.0);
        Hatchback hatchback = new Hatchback("Kia", "Rio", 2015, "White", 1.6);

        garage.parked(garage.carGarage, sedan);
        garage.parked(garage.carGarage, sedan);
        garage.parked(garage.carGarage, sedan);
        garage.departure(garage.carGarage, sedan);
        garage.parked(garage.carGarage, sedan);

        garage.parked(garage.carGarage, sedan1);
        garage.parked(garage.carGarage, sedan1);
        garage.departure(garage.carGarage, sedan1);

        garage.parked(garage.carGarage, universal);
        garage.parked(garage.carGarage, universal);
        garage.departure(garage.carGarage, universal);
        garage.departure(garage.carGarage, universal);

        garage.parked(garage.carGarage, coupe);
        garage.departure(garage.carGarage, coupe);
        garage.parked(garage.carGarage, coupe);
        garage.departure(garage.carGarage, coupe);

        garage.parked(garage.carGarage, coupe1);
        garage.parked(garage.carGarage, coupe1);

        garage.parked(garage.carGarage, hatchback);
        garage.parked(garage.carGarage, hatchback);
        garage.departure(garage.carGarage, hatchback);

        System.out.println(garage.carGarage);

        System.out.println("\nUniversal:" + garage.getQualityCar(garage.carGarage, universal));
        System.out.println("Hatchback:" + garage.getQualityCar(garage.carGarage, hatchback));
        System.out.println("Sedan:" + garage.getQualityCar(garage.carGarage, sedan));
        System.out.println("Coupe:" + garage.getQualityCar(garage.carGarage, coupe));
        System.out.println("Sedan1:" + garage.getQualityCar(garage.carGarage, sedan1));
        System.out.println("Coupe1:" + garage.getQualityCar(garage.carGarage, coupe1));
    }
}