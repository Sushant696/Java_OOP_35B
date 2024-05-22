public class MultiDimArrays {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][5]; // Initialization
        twoDimArray[0][0] = 10;
        twoDimArray[0][1] = 20;
        twoDimArray[0][2] = 87;
        System.out.println(twoDimArray[0][0]);

        int[][] new2Darray = new int[5][2]; // Initialization
        new2Darray[0][0] = 10;
        new2Darray[0][1] = -10;
        new2Darray[1][0] = 20;
        new2Darray[1][1] = -20;
        new2Darray[2][0] = -30;
        new2Darray[2][1] = 8;
        new2Darray[3][0] = 40;
        new2Darray[3][1] = 45;
        new2Darray[4][0] = 50;
        new2Darray[4][1] = 56;

        System.out.println(new2Darray[4][0] + " " + new2Darray[4][1]);

        int[][] arrTwo = {
                { 10, -10 },
                { 20, -20 },
                { -30, 8 },
                { 40, 45 },
                { 50, 56 },
        };

        // three d array, three square bracket

        // int[][][] threeDArray = new int [][][];
        // threeDArray[0][0][0] = 23;

        // looping into multi dimension array

        // int outerLen = arrTwo.length;
        // for (int outer = 0; outer < outerLen; outer++) {
        // int innerLength = arrTwo[outer].length;
        // for (int inner = 0; inner < innerLength; inner++) {
        // System.out.println(arrTwo[outer][inner]);
        // }
        // }

        String[][] names = {
                { "sarjak", "Ayush", "Rabi" },
                { "Yudip", "Utsav", "Bibek" },
                { "Rabina", "Kimti", "Sneha" }
        };

        int outerLen = names.length;
        for (int outer = 0; outer < outerLen; outer++) {
            int innerLength = names[outer].length;
            for (int inner = 0; inner < innerLength; inner++) {
                System.out.println(names[outer][inner]);
                if (names[outer][inner].equals("Kimti")) {
                    System.out.println(outer + " " + inner);
                }
            }
        }

    }
}
