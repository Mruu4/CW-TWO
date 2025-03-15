package Main;

        import cars.Car;
        import owners.Owner;

        public class Main {
        public static void main(String[] args) {
        // Create Owner
        Owner owner = new Owner("Faruq");
        owner.displayOwner();

        // Create Car
        Car car = new Car("Tesla Model S");
        car.displayCar();

        }
        }