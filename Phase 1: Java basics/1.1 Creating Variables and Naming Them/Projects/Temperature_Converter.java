package Projects;

import java.util.Locale;
import java.util.Scanner;

public class Temperature_Converter {

    // unit: 1 = Celsius, 2 = Fahrenheit, 3 = Kelvin
    public static double toCelsius(double value, int unit) {
        if (unit == 1) {
            return value;
        } else if (unit == 2) {
            return (value - 32) * 5.0 / 9.0;
        } else {
            return value - 273.15;
        }
    }

    public static double fromCelsius(double celsius, int unit) {
        if (unit == 1) {
            return celsius;
        } else if (unit == 2) {
            return celsius * 9.0 / 5.0 + 32;
        } else {
            return celsius + 273.15;
        }
    }

    public static String unitSymbol(int unit) {
        if (unit == 1) {
            return "C";
        } else if (unit == 2) {
            return "F";
        } else {
            return "K";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("Convert from: 1) Celsius  2) Fahrenheit  3) Kelvin  0) Quit");
            int from = input.nextInt();

            if (from == 0) {
                running = false;
            } else if (from < 1 || from > 3) {
                System.out.println("Please choose 0, 1, 2 or 3.");
            } else {
                System.out.println("Convert to: 1) Celsius  2) Fahrenheit  3) Kelvin");
                int to = input.nextInt();

                if (to < 1 || to > 3) {
                    System.out.println("Please choose 1, 2 or 3.");
                } else {
                    System.out.println("Enter the temperature:");
                    double value = input.nextDouble();
                    double celsius = toCelsius(value, from);

                    if (celsius < -273.15 - 0.000001) {
                        System.out.println("That is below absolute zero, which is impossible.");
                    } else {
                        double result = fromCelsius(celsius, to);
                        System.out.printf(Locale.US, "%.2f %s = %.2f %s%n",
                                value, unitSymbol(from), result, unitSymbol(to));
                    }
                }
            }
        }
        input.close();
    }
}