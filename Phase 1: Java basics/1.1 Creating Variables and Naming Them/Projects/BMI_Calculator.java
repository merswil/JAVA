package Projects;

import java.util.Locale;
import java.util.Scanner;

public class BMI_Calculator {

    public static double calculateBmi(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    public static String category(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your weight in kg:");
        double weightKg = input.nextDouble();
        System.out.println("Enter your height in cm:");
        double heightCm = input.nextDouble();

        if (weightKg <= 0 || heightCm <= 0) {
            System.out.println("Weight and height must be greater than zero.");
        } else {
            double bmi = calculateBmi(weightKg, heightCm);
            System.out.printf(Locale.US, "Your BMI is %.1f (%s)%n", bmi, category(bmi));
        }
        input.close();
    }
}