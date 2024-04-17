package project.part2;

public class CurrencyConverter {
    public static String spellDollar(double number, String firstForm, String secondForm, String thirdForm) {
        if (5 <= number && number <= 20) {
            return thirdForm;
        } else {
            int digit = (int) number % 10;

            if (digit == 1) {
                return firstForm;
            } else if (2 <= digit && digit <= 4) {
                return secondForm;
            } else {
                return thirdForm;
            }
        }
    }
}
