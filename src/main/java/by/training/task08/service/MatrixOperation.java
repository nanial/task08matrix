package by.training.task08.service;

import by.training.task08.exception.MatrixException;

public interface MatrixOperation {

    int [][] multiply(int[][] a, int[][] b) throws MatrixException;
}
