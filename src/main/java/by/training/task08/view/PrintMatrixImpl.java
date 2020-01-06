package by.training.task08.view;

import java.util.Arrays;

public class PrintMatrixImpl implements PrintMatrix {

    public void printMatrix(int[][] matrix) {

        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }

    }
}
