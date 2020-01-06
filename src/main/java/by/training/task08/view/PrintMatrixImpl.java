package by.training.task08.view;

import java.util.Arrays;

public class PrintMatrixImpl implements PrintMatrix {

    public void printMatrix(int[][] matrix) {

        System.out.println("Result of multiply two matrix is: ");

        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}
