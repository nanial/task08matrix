package by.training.task08.service;

import by.training.task08.exception.MatrixException;
import by.training.task08.validator.MatrixValidator;

public class MatrixOperationImpl implements MatrixOperation {

    @Override
    public int[][] multiply(int[][] p, int[][] q) throws MatrixException {

        int[][] resMatrix = new int[p.length][q[0].length];

        if(new MatrixValidator().checkRange(p, q)) {

            for (int i = 0; i < p.length; i++) {

                for (int j = 0; j < q[0].length; j++) {

                    for (int k = 0; k < p[j].length; k++) {

                        resMatrix[i][j] += p[i][k] * q[k][j];
                    }
                }
            }
        }
        return resMatrix;
    }
}
