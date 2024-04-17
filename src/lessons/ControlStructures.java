package lessons;

import java.util.Scanner;

public class ControlStructures {
    public static void bmiCalculator() {
        final int SMS_PER_METER = 100;

        double weight, height, bmi;
        String resultText;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите рост: ");
        height = input.nextDouble();

        System.out.print("Введите вес: ");
        weight = input.nextDouble();
        System.out.println();

        bmi = weight / Math.pow(height / SMS_PER_METER, 2);

        System.out.println("BMI равно " + bmi);
        if (bmi >= 30.0) {
            resultText = "Ожирение";
        } else if (bmi >= 25.0) {
            resultText = "Избыточный вес";
        } else if (bmi >= 18.5) {
            resultText = "Норма";
        } else {
            resultText = "Недостаточный вес";
        }

        System.out.println(resultText);
    }
}
