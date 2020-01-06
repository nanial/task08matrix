package by.training.task08.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Matrix implements Serializable {

    private int row;
    private int column;
    private int[][] matrix;

    public Matrix(int row, int column) {

        this.matrix = new int[row][column];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) return false;

        Matrix matrix1 = (Matrix) o;

        if (getRow() != matrix1.getRow()) return false;
        if (getColumn() != matrix1.getColumn()) return false;
        return Arrays.deepEquals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = getRow();
        result = 31 * result + getColumn();
        result = 31 * result + Arrays.deepHashCode(matrix);
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "row=" + row +
                ", column=" + column +
                ", matrix=" + Arrays.toString(matrix) +
                '}';
    }
}
