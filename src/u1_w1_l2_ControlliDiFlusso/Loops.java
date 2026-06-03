package u1_w1_l2_ControlliDiFlusso;

import java.util.Scanner;

public class Loops {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("dammi un numero");
//        int x = Integer.parseInt(scanner.nextLine());
//        System.out.println("dammi un numero");
//        int y = Integer.parseInt(scanner.nextLine());
//
//        while (y <= x + 50) {
//            x++;
//            y += 5;
//        }

        int sum = 0;
        int numero = 0;

//        while (true) {
//            System.out.println("DAMMI UN NUMERI");
//            int numero = Integer.parseInt(scanner.nextLine());
//            if (numero == 0) break;
//            sum += numero;
//        }
//        System.out.println(sum);

//        do {
//            System.out.println("DAMMI UN NUMERO");
//            numero = Integer.parseInt(scanner.nextLine());
//            sum = sum + numero;
//        } while (numero != 0);


        int[] numbers = new int[10];

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("DAMMI UN NUMERO INTERO");
//            numbers[i] = Integer.parseInt(scanner.nextLine());
//        }
//        System.out.println(Arrays.toString(numbers));

        //ENHANCED FOR LOOP IN JAVA ATTENZIONE CON QUESTO METODO NON POTREMO ACCEDERE ALL'INDICE DEGLI ARRAY

//        for (int element : numbers) {
//            System.out.println(element);
//        }

        for (int i = 0; i < 100; i++) {
            if (i == 80) continue; // il ciclo salterà il numero 80, quindi skipperà un "giro"
        }

        // INFINE ABBIAMO I NESTED FOR LOOP

        for (int i = 0; i < 5; i++) {
            if (i == 3) continue;
            System.out.println("i ---> " + i);
            for (int j = 0; j < 5; j++) {
                if (j == 2) break;
                System.out.println("j ---> " + j);
            }

        }
    }


}
