import java.util.Scanner;

public class Esercizio_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void perimetroRettangolo(double num1, double num2) {
        double total = (num1 * 2) + (num2 * 2);
        System.out.println(total);
    }

    public static int pariDispari(int num1) {
        if (num1 % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(double lato1, double lato2, double lato3) {

        double p = (lato1 + lato2 + lato3) / 2;

        double area = Math.sqrt(p * (p - lato1) * (p - lato2) * (p - lato3));
        System.out.println(area);
        return area;
    }
}
