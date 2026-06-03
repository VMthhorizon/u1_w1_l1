package u1_w1_l2_ControlliDiFlusso;

public class ifElse {

    static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();
//        if (input.isEmpty()) System.out.println("La Stringa è vuota!");
//        else System.out.println("La stringa non è vuota");

        double totale = 50.0;

        double spedizione = totale >= 50.0 ? 0.0 : 5.99;
        System.out.println(spedizione);
    }
}
