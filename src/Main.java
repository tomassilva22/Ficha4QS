import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static final int MAX_PARK_CAPACITY = 500;
    private static final double HOURLY_RATE = 0.40;
    private static final double MONTHLY_DISCOUNT = 0.10;

    public Student maxSpender;
    ArrayList<Student> studentsIn = new ArrayList<Student>();
    public static int currentParkOcupation = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to UPT Parking Lot");
        System.out.println("1. Enter the parking lot");
        System.out.println("2. Exit the parking lot");
        System.out.println("3. Exit the program");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice != 3) {

            if (choice == 1) {
                if (currentParkOcupation >= MAX_PARK_CAPACITY) {
                    System.out.println("The parking lot is full. Please try again later.");
                } else {
                    System.out.print("Enter your student number: ");
                    String studentNumber = scanner.nextLine();
                }
            } else if (choice == 2) {
                System.out.print("Enter your student number: ");
                String studentNumberExit = scanner.nextLine();

                if (studentParkingTimes.containsKey(studentNumberExit)) {
                    System.out.println("Exit from the parking lot registered successfully!");

                } else {
                    System.out.println("Student number not found in the parking lot.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting the program.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid option. Please try again.");
            }

            System.out.println("Bem-vindo ao Parque de Estacionamento da UPT!");
            System.out.println("1. Entrar no parque");
            System.out.println("2. Sair do parque");
            System.out.println("3. Sair do programa");
            System.out.print("Escolha uma opção: ");

            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    private static double calculateAmountToPay(double parkingTime) {
        return parkingTime * HOURLY_RATE;
    }
}
