import java.util.Scanner;

public class Esercizio_2 {

    static Scanner scanner = new Scanner(System.in);

    public static void printString() {
        System.out.println("INSERISCI LA PRIMA FRASE");
        String frase1 = scanner.nextLine();
        System.out.println("INSERISCI LA SECONDA FRASE");
        String frase2 = scanner.nextLine();
        System.out.println("INSERISCI LA TERZA FRASE");
        String frase3 = scanner.nextLine();

        System.out.println(String.join(" ", frase1, frase2, frase3));
        System.out.println(String.join(" ", frase3, frase2, frase1));
    }
}
