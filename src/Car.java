public class Car {
    private int horsepower;
    private int engineVolume;
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car(int horsepower, int engineVolume, String brand, String model, int year, String color) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(150, 2000, "Toyota", "Camry", 2015, "Silver"),
                new Car(120, 1600, "Honda", "Civic", 2013, "Black"),
                new Car(180, 2200, "Nissan", "Maxima", 2018, "Red"),
                new Car(90, 1400, "Ford", "Fiesta", 2012, "Blue"),
                new Car(200, 2500, "BMW", "320i", 2016, "White"),
                new Car(110, 1500, "Volkswagen", "Golf", 2014, "Gray"),
                new Car(130, 1800, "Mazda", "3", 2017, "Green"),
                new Car(100, 1200, "Chevrolet", "Spark", 2011, "Yellow"),
                new Car(170, 2100, "Kia", "Optima", 2019, "Brown"),
                new Car(140, 1900, "Hyundai", "Entrant", 2016, "Orange")
        };

        int totalEngineVolume = 0;
        int totalHorsepower = 0;

        for (Car car : cars) {
            totalEngineVolume += car.getEngineVolume();
            totalHorsepower += car.getHorsepower();
        }

        System.out.println("The sum of engine volumes of all cars is: " + totalEngineVolume);
        System.out.println("The sum of horsepower's of all cars is: " + totalHorsepower);
    }
}

