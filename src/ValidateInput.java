import java.util.Scanner;

public class ValidateInput {
    public static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(StaffManagementSystem.sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(StaffManagementSystem.RED + "Invalid input. Please enter a valid integer: " + StaffManagementSystem.RESET);
            }
        }
    }

    public static double getDoubleInput() {
        while (true) {
            try {
                return Double.parseDouble(StaffManagementSystem.sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(StaffManagementSystem.RED + "Invalid input. Please enter a valid double: " + StaffManagementSystem.RESET);
            }
        }
    }

    public static String getStringInput(Scanner sc, String errorMessage) {
        String input = sc.nextLine();

        // Check if input is empty
        while (input.trim().isEmpty()) {
            System.out.print(errorMessage);
            input = sc.nextLine();
        }

        while (!input.matches("[a-zA-Z ]+")) {
            System.out.print(StaffManagementSystem.RED + "Invalid input. Only letters and spaces are allowed." + StaffManagementSystem.RESET);
            input = sc.nextLine();
        }
        return input;
    }
}
