package lessons;

import java.util.Scanner;

public class CalculateTriangleAngles {
    public static void calculate() {
        double x1, y1, x2, y2, x3, y3;

        Scanner input = new Scanner(System.in);

        // Получить декартовы координаты трех вершин треугольника
        System.out.print("Введите декартовы координаты трех вершин треугольника "
                + "через пробел \nx1 y1 x2 y2 x3 y3: ");

        x1 = input.nextDouble();//57,6299
        y1 = input.nextDouble();//39,8737
        x2 = input.nextDouble();//55,7522
        y2 = input.nextDouble();//37,6165
        x3 = input.nextDouble();//56,1366
        y3 = input.nextDouble();//40,3966

        double AB = getLength(x1, y1, x2, y2),
                BC = getLength(x2, y2, x3, y3),
                CA = getLength(x1, y1, x3, y3);

        double a = getAngles(AB, BC, CA),
                b = getAngles(BC, AB, CA),
                c = getAngles(CA, BC, AB);

        System.out.println("Три угла треугольника равны " + a + " " + b + " " + c + " градуса.");
    }

    private static double getLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    private static double getAngles(double length1, double length2, double length3) {
        double numerator = Math.pow(length1, 2) - Math.pow(length2, 2) - Math.pow(length3, 2),
                denominator = -2 * length2 * length3,
                arCos = Math.acos(numerator / denominator),
                degrees = Math.toDegrees(arCos);

        return Math.round(degrees * 100) / 100.0;
    }
}
