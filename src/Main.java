import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // tip nume

//        String [] studenti;
//        int numere[];
//
//        studenti = new String[10];
//        numere = new int[5];
//
//        double[] duble = new double[7];
//
//        studenti[0] = "Mihai";
//        studenti[1] = "Anamaria";
//        System.out.println(studenti[0]);
//        System.out.println(studenti[1]);
//        System.out.println(studenti[2]);
//        System.out.println(studenti[10]);
//        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//
//        System.out.println(numere[0]);
//
//
//        // Array literal
//        String[] literal = {"Alexandru", "mere", "masa"};
//        System.out.println(literal[0]);
//        System.out.println(literal[1]);
//        System.out.println(literal[2]);
//
//        System.out.println(literal[5]);


//    String[][] bidimensional = new String[3][6];
//    String[][][] tridimensional = new String[2][3][1];
//
//    bidimensional[0][0] = "curs";
//    bidimensional[2][1] = "capitol";
//
//        System.out.println(bidimensional[0][0]);
//        System.out.println(bidimensional[2][1]);
//
//        String[][] multidimensional = {
//                {"laptop", "masa"},
//                {"tastatura"}};
//        System.out.println(multidimensional[0][0]);
//        System.out.println(multidimensional[0][1]);
//        System.out.println(multidimensional[1][0]);

        String[] studenti = new String[10];
        int[] numere = new int[5];
        studenti[0] = "Mihai";
        studenti[1] = "Alex";
//        System.out.println(studenti[0]);
//        System.out.println(studenti[1]);
//        System.out.println(studenti[2]);

        String[] fructe = {"mere", "pere", "banane"};


        ArrayList <String> list = new ArrayList<>();
        ArrayList<Integer> inturi = new ArrayList<>();

        list.add("mere"); //add - pt a insera elemente
        list.add("pere");
        //System.out.println(list);

        System.out.println(list.get(0)); // get - pt a accesa un element dintr-o lista
        System.out.println(list.get(1));

        list.set(0, "banane"); // modificare element din lista
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));

        list.add("ananas");
        list.add("avocado");

        System.out.println(list.size());

        list.clear();
        System.out.println("Dupa clear");
        System.out.println(list);
        System.out.println(list.size());
    }
}