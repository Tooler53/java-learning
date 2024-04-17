package project.part1;

import java.util.Scanner;

public class CurrencyConverter {
    public static double convert() {
        final double CURRENCY_RATIO = 72.12;

        double rubles, dollars;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму в долларах: ");
        dollars = input.nextDouble();
        String spellNumber = project.part2.CurrencyConverter.spellDollar(dollars, "доллар равен", "доллара равны", "долларов равны");

        System.out.print(dollars + " американский " + spellNumber + " ");
        rubles = CURRENCY_RATIO * dollars;

        System.out.println(rubles + " российского рубля.");

        return rubles;
    }
}
