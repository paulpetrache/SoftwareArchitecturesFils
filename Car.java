public class Car {
    // Required attributes
    private final String engine;
    private final String transmission;

    // Optional attributes
    private final String interior;
    private final String exteriorColor;
    private final String rims;
    private final boolean hasSunroof;
    private final boolean hasGPS;
    private final boolean hasSoundSystem;
    private final boolean hasABS;
    private final boolean hasAirbags;
    private final boolean hasRearCamera;

    // Private constructor to be used by the builder
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.interior = builder.interior;
        this.exteriorColor = builder.exteriorColor;
        this.rims = builder.rims;
        this.hasSunroof = builder.hasSunroof;
        this.hasGPS = builder.hasGPS;
        this.hasSoundSystem = builder.hasSoundSystem;
        this.hasABS = builder.hasABS;
        this.hasAirbags = builder.hasAirbags;
        this.hasRearCamera = builder.hasRearCamera;
    }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Transmission=" + transmission + 
               ", Interior=" + interior + ", Exterior Color=" + exteriorColor + 
               ", Rims=" + rims + ", Sunroof=" + hasSunroof + 
               ", GPS=" + hasGPS + ", SoundSystem=" + hasSoundSystem + 
               ", ABS=" + hasABS + ", Airbags=" + hasAirbags + 
               ", RearCamera=" + hasRearCamera + "]";
    }

    // Static nested CarBuilder class
    public static class CarBuilder {
        // Required attributes
        private final String engine;
        private final String transmission;

        // Optional attributes (initialized to default values)
        private String interior = "Standard Fabric";
        private String exteriorColor = "White";
        private String rims = "Standard Rims";
        private boolean hasSunroof = false;
        private boolean hasGPS = false;
        private boolean hasSoundSystem = false;
        private boolean hasABS = true; // ABS is often a default safety feature
        private boolean hasAirbags = true; // Airbags are typically mandatory
        private boolean hasRearCamera = false;

        // Constructor for required attributes
        public CarBuilder(String engine, String transmission) {
            this.engine = engine;
            this.transmission = transmission;
        }

        // Optional configuration methods (return builder for chaining)
        public CarBuilder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public CarBuilder setExteriorColor(String exteriorColor) {
            this.exteriorColor = exteriorColor;
            return this;
        }

        public CarBuilder setRims(String rims) {
            this.rims = rims;
            return this;
        }

        public CarBuilder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public CarBuilder setSoundSystem(boolean hasSoundSystem) {
            this.hasSoundSystem = hasSoundSystem;
            return this;
        }

        public CarBuilder setABS(boolean hasABS) {
            this.hasABS = hasABS;
            return this;
        }

        public CarBuilder setAirbags(boolean hasAirbags) {
            this.hasAirbags = hasAirbags;
            return this;
        }

        public CarBuilder setRearCamera(boolean hasRearCamera) {
            this.hasRearCamera = hasRearCamera;
            return this;
        }

        // Method to build the final Car object
        public Car build() {
            return new Car(this);
        }
    }
}
