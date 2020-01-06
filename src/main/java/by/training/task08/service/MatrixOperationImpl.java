package by.training.task08.service;

public class MatrixOperationImpl implements MatrixOperation {

    @Override
    public int[][] multiply(int[][] p, int[][] q) {

        int[][] resMatrix = new int[p.length][q[0].length];

        for (int i = 0; i < p.length; i++) {

            for (int j = 0; j < q[0].length; j++) {

                for (int k = 0; k < p[j].length; k++) {

                    resMatrix[i][j] += p[i][k] * q[k][j];
                }
            }
        }
        return resMatrix;
    }
}
