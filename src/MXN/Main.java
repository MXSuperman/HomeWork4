package MXN;


public class Main {

    public static void main(String[] args) {
        // int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        // weights[0] = 90;
        // int januaryWeight = weights[0];
        //      System.out.println(januaryWeight);
        //      System.out.println(weights[0]);
        //      System.out.println(weights[4]);
        //      int january = 0;
        //      System.out.println(weights[january]);
        //      for (int i = 0; i < weights.length; i++) {
        //           System.out.println(weights[i]);


        // Задание 1

        int[] sets = new int[]{1, 2, 3};
        double[] sport = new double[]{1.57, 7.654, 9.986};
        short[] tennis = {10, 15, 22, 40, 65, 30, 88};

        // Задание 2

        sets[0] = 1;
        sets[1] = 2;
        sets[2] = 3;
        for (int i = 0; i < sets.length; i++) {
            if (i == sets.length - 1) {
                System.out.println(sets[i]);
            } else {
                System.out.println(sets[i] + ", ");
            }
        }

        sport[0] = 1.57d;
        sport[1] = 7.654d;
        sport[2] = 9.986d;
        for (int i = 0; i < sport.length; i++) {
            if (i == sport.length - 1) {
                System.out.println(sport[i]);
            } else {
                System.out.println(sport[i] + ", ");
            }
        }
//
        tennis[0] = 10;
        tennis[1] = 15;
        tennis[2] = 22;
        tennis[5] = 30;
        tennis[3] = 40;
        tennis[4] = 65;
        tennis[6] = 88;

        for (int i = 0; i < tennis.length; i++) {
            if (i == tennis.length - 1) {
                System.out.println(tennis[i]);
            } else {
                System.out.println(tennis[i] + ", ");
            }
        }

        // Задание 3

        int[] sets1 = new int[]{1, 2, 3};
        for (int i = sets1.length - 1; i >= 1; i--) {
            System.out.println(sets1[i] + ", ");
        }
        System.out.println(sets1[0]);

        //

        double[] sportik = new double[]{1.57d, 7.654d, 9.986d};
        for (int i = sportik.length - 1; i >= 1; i--) {
            System.out.println(sportik[i] + ", ");
            System.out.println(sportik[0]);
        }
        //

        int[] tennis1 = new int[]{10, 15, 22, 40, 65, 30, 88};
        for (int i = tennis1.length - 1; i >= 0; i--) {
            System.out.println(tennis1[i] + ", ");
        }

        // Задание 4
//
        int[] setsUs = new int[]{1, 2, 3};
        for (int i = 0; i < setsUs.length; i++) {
            if (setsUs[i] % 2 != 0)
                setsUs[i] += 1;
            if (i != setsUs.length - 1)
            System.out.println(setsUs[i] + ", ");
         else
            System.out.println(setsUs[i]);
        }
    }
}