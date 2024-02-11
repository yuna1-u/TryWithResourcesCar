public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        try {
            car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}