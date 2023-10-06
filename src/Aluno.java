
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aluno {
    private static final int PARKING_CAPACITY = 500;
    private static Map<String, String> students = new HashMap<>();
    private static Map<String, String> parkingSpaces = new HashMap<>();
    private static Map<String, Long> entryTimes = new HashMap<>();
    private static Map<String, Double> payments = new HashMap<>();
    private static Map<String, String> carLicensePlates = new HashMap<>();
    private static Map<String, Double> monthlyExpenses = new HashMap<>();

    private static void registerExit(Scanner scanner, String username) {
        if (entryTimes.containsKey(username)) {
            long exitTime = System.currentTimeMillis();
            long entryTimeStudent = entryTimes.get(username);

            long parkedTimeMillis = exitTime - entryTimeStudent;
            long parkedMinutes = parkedTimeMillis / (60 * 1000);

            double amountToPay = (parkedMinutes / 15) * 0.10;

            // Update the student's monthly expenses
            if (!monthlyExpenses.containsKey(username)) {
                monthlyExpenses.put(username, 0.0);
            }
            double currentMonthlyExpense = monthlyExpenses.get(username);
            monthlyExpenses.put(username, currentMonthlyExpense + amountToPay);

            System.out.println("Time parked: " + parkedMinutes + " minutes.");
            System.out.println("Amount to pay: " + amountToPay + " €.");
           // parkingSpaces.put(getSpaceForUser(username), null);
            entryTimes.remove(username);

            // Check if the student paid more in the previous month and apply the discount
            if (currentMonthlyExpense > 0 && payments.containsKey(username)) {
                double previousMonthPayment = payments.get(username);
                if (currentMonthlyExpense > previousMonthPayment) {
                    double discount = currentMonthlyExpense * 0.10;
                    payments.put(username, currentMonthlyExpense - discount);
                    System.out.println("10% discount applied for the next month.");
                }
            }
        } else {
            System.out.println("You haven't reserved a parking space or have already registered your exit.");
        }
    }
}
