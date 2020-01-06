package by.training.task08.service;

import java.util.Random;

public class CreateMatrixImpl implements CreateMatrix {

    public int[][] create(int row, int column) {

        int matrix[][] = new int[row][column];

        for (int i = 0; i < matrix.length; i++){

            for (int j = 0; j < matrix[i].length; j++){

                matrix[i][j] = new Random().nextInt(20) - 10;
            }
        }
        return matrix;
    }
}
