public class Main {
    public static void main(String[] args) {

        
        int a = 14; // 1 uzduotis
        int b = 10;
        sum(a, b);
        sum(2, 5);

        System.out.println("--------------");

        System.out.println(PISq()); // 2 uzduotis

        System.out.println("--------------");


        multi(5, 4);  // 3 uzduotis

        System.out.println("--------------");


        int[] arr4 = {5, 10, 15, 20, 25};// 4 uzduotis
        printArr4(arr4);

        System.out.println("--------------");


        printArr4(printArr5(2, 30)); // 5 uzduotis

        System.out.println("--------------");

        System.out.println(printArr6(printArr5(10, 35))); // 6 uzduotis

        System.out.println("--------------");

        System.out.println(printArr7(printArr5(10, 20))); // 7 uzduotis

        System.out.println("--------------");

        sqr8(5, 2); // 8 uzduotis


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

    public static int printArr7(int[] arr5) {
        int arr7Middle = 0;
        for (int i = 0; i < arr5.length; i++) {
            arr7Middle = 20 / arr5.length;
        }
        return arr7Middle;
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




}