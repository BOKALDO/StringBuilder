package TestJava;

import java.util.Random;

public class J2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[][] data = {{1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12}};

        Random random = new Random();

        for(int i = 0; i < data[i].length; i++) {

            for(int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");


            }
        }

    }
}
