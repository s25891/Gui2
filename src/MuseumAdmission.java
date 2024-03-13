import java.util.Scanner;
public class MuseumAdmission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Museum Admission Calculator");

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a resident of Warsaw? (yes/no): ");
        String residentResponse = scanner.next().toLowerCase();
        boolean isWarsawResident = residentResponse.equals("yes");

        System.out.print("Is today Thursday (yes/no): ");
        String thursdayResponse = scanner.next().toLowerCase();
        boolean isThursday = thursdayResponse.equals("yes");

        double ticketPrice = calculateTicketPrice(age, isWarsawResident, isThursday);

        if (ticketPrice > 0) {
            System.out.println("The price of your ticket is: " + ticketPrice + "PLN");
        } else {
            System.out.println("You are eligible for free admission");
        }

        scanner.close();
    }

    public static double calculateTicketPrice(int age, boolean isWarsawResident, boolean isThursday) {
        double basePrice = 40.0;

        if (isThursday) {
            return 0;
        }

        if (age < 10) {
            return 0;
        } else if (age <= 10) {
            basePrice *= 0.5;
        }

        if (isWarsawResident) {
            basePrice *= 0.9;
        }

            return basePrice;
        }
    }