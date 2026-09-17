package inventory.util;

import java.util.Scanner;

public class InputValidator {

    public static int getInt(Scanner sc, String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public static double getDouble(Scanner sc, String message) {
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a valid price.");
            }
        }
    }
}