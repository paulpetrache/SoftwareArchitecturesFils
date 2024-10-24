public class Main {
    public static void main(String[] args) {
        // Example 1: Custom car configuration
        Car customCar = new Car.CarBuilder("V6", "Automatic")
                        .setExteriorColor("Blue")
                        .setInterior("Leather")
                        .setSunroof(true)
                        .setGPS(true)
                        .setSoundSystem(true)
                        .build();
        
        System.out.println(customCar);

        // Example 2: Another configuration (e.g., sports car)
        Car sportsCar = new Car.CarBuilder("V8", "Manual")
                        .setExteriorColor("Red")
                        .setInterior("Leather")
                        .setRims("Sports Rims")
                        .setSunroof(true)
                        .build();

        System.out.println(sportsCar);
    }
}
