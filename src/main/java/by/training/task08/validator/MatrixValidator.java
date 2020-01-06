package by.training.task08.validator;

import by.training.task08.exception.MatrixException;

public class MatrixValidator {

    public boolean checkRange(int [][] matrixA, int [][] matrixB) throws MatrixException {

        if ( matrixA.length > 0 && matrixB.length > 0 ) {

            if (matrixA.length == matrixB[0].length) {

                return true;
            }
            else {
                throw new MatrixException("Rows and columns aren't commutative");
            }
        }
        else {
            throw new MatrixException("Matrix is/are empty");
        }
    }
}
