public class ParkManager {

    // constant that defines the price for 15 minutes of park
    private static final double RATE_PER_FIFTEEN_MINUTES = 0.1;


    private static double calculatePrice (double timeParked) {
        return (timeParked / RATE_PER_FIFTEEN_MINUTES) * 15;
    }

}
