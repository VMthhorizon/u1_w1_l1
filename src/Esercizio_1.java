public class Esercizio_1 {

    public static int moltiplica(int num1, int num2){
        return num1*num2;
    }

    public static String concatena(String elem1, int elem2){
        return elem1 + elem2;
    }

    public static String[] inserisciilnArary(String[] elem1, String elem2) {
            String[] array = new String[6];
            array[0] = elem1[0];
            array[1] = elem1[1];
            array[2] = elem2;
            array[3] = elem1[2];
            array[4] = elem1[3];
            array[5] = elem1[4];
            return array;
    }
}
