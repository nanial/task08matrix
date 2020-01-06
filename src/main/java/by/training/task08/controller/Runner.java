package by.training.task08.controller;

import by.training.task08.exception.MatrixException;
import by.training.task08.service.*;
import by.training.task08.validator.MatrixValidator;
import by.training.task08.view.PrintMatrix;
import by.training.task08.view.PrintMatrixImpl;

public class Runner {

    public static void main(String[] args) {

        ReadMatrix rm = new ReadMatrix();
        int[][] firstReadMatrix =
                rm.readMatrix("D:\\study\\java\\by.training.task08matrix\\matrix.txt");
        int[][] secondReadMatrix =
                rm.readMatrix("D:\\study\\java\\by.training.task08matrix\\secondMatrix.txt");
        CreateMatrix cm = new CreateMatrixImpl();
        int [][] p = cm.create(10, 8);
        int [][] q = cm.create(8, 10);
        MatrixValidator mv = new MatrixValidator();
        MatrixOperation mo = new MatrixOperationImpl();
        PrintMatrix pm = new PrintMatrixImpl();

        try{
            mv.checkRange(p, q);
            mv.checkRange(firstReadMatrix, secondReadMatrix);
            pm.printMatrix(mo.multiply(p, q));
            pm.printMatrix(mo.multiply(firstReadMatrix, secondReadMatrix));

        }catch (MatrixException me){
            me.getMessage();
        }
    }
}
