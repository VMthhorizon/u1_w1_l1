import java.util.Scanner;

public class Esercizio_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void perimetroRettangolo(double num1, double num2){
        double total = (num1 * 2) + ( num2 * 2);
        System.out.println(total);
    }

    public static int pariDispari(int num1){
        if (num1 % 2 == 0) {
            return 0;
        }else {
            return 1;
        }
    }

    public static double areaTriangolo() {
        System.out.println("INSERISCI IL PRIMO NUMERO");
        double x = scanner.nextDouble();
        System.out.println("INSERISCI IL PRIMO NUMERO");
        double y = scanner.nextDouble();
        System.out.println("INSERISCI IL PRIMO NUMERO");
        double z = scanner.nextDouble();
        double p = (x + y + z) / 2;

        double area = Math.sqrt(p * (p - x) * (p-y) * (p-z));
        System.out.println(area);
        return area;
    }
}
