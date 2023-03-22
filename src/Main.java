public class Main {
    public static void main(String[] args) {


        System.out.println("------1--------");

        int a = 14; // 1 uzduotis
        int b = 10;
        sum(a, b);
        sum(2, 5);

        System.out.println("-------2-------");

        System.out.println(PISq()); // 2 uzduotis

        System.out.println("-------3-------");


        multi(5, 4);  // 3 uzduotis

        System.out.println("------4--------");


        int[] arr4 = {5, 10, 15, 20, 25};// 4 uzduotis
        printArr4(arr4);

        System.out.println("------5--------");

        int[] arr = printArr5(2, 30);
        printArr4(arr); // 5 uzduotis

        System.out.println("------6--------");

        System.out.println(printArr6(arr)); // 6 uzduotis

        System.out.println("-------7-------");

        System.out.println(printArr7(arr)); // 7 uzduotis
        System.out.println(printArr71(arr)); // 7 uzduotis

        System.out.println("------8--------");

        sqr8(5, 2); // 8 uzduotis

        System.out.println("-------9-------");

        letterCount("Kaip as myliu funkcijas"); // 9 uzduotis

        System.out.println("-------10-------");

        String backwards = "Kaip as myliu funkcijas";
        System.out.println(reversedSentence(backwards));


    }

    //          1 uzduotis
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }


    //          2 uzduotis
    public static double PISq() {

        return 9.8586;
    }


    //          3 uzduotis
    public static void multi(int a, int b) {

        System.out.println(a * b);
    }


    //          4 uzduotis
    public static void printArr4(int[] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
    }


    //          5 uzduotis
    public static int[] printArr5(int min5, int max5) {
        int[] arr5 = new int[5];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = min5 + (int) Math.round(Math.random() * (max5 - min5));
        }
        return arr5;
    }


//          6 uzduotis

    public static int printArr6(int[] arr5) {
//        int [] arr5 = new int[5];
        int arr6sum = 0;
        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = min5 + (int) Math.round(Math.random() * (max5 - min5));
            arr6sum += arr5[i];

        }
        return arr6sum;
    }


//          7 uzduotis

    public static double printArr7(int[] arr5) {
        double arr7Middle = 0;
        for (int i = 0; i < arr5.length; i++) {//7,7,4
            arr7Middle += (double) arr5[i] / arr5.length; // + (double)
        }
        return arr7Middle;
    }

    public static double printArr71(int[] arr5) {

        return printArr6(arr5) / arr5.length;  // - (double)
    }


//          8 uzduotis

    public static void sqr8(int loopOut, int loopInn) {
        for (int i = 0; i <= loopOut; i++) {
            String stars8 = "";
            for (int a = 0; a <= loopInn; a++) {
                stars8 = stars8 + "*";
            }
            System.out.println(stars8);
        }
    }


//          9 uzduotis

    public static void letterCount(String sentence) {
        System.out.println("Simboliu: " + sentence.length());
        System.out.println("Raidziu: " + sentence.replace(" ", "").length());
        System.out.println("Tarpu: " + (sentence.length() - sentence.replace(" ", "").length()));


    }

//          10 uzduotis

    public static String reversedSentence(String backwards) {
        String revesedStr = "";
        for (int i = 0; i < backwards.length(); i++) {
            revesedStr = backwards.charAt(i) + revesedStr;
        }
        return revesedStr;


    }


}