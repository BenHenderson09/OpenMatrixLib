package OML;

import java.util.Random;

public class MatrixManipulation {
    private Random rand = new Random();
    private double[][] matrix;
    private int rows;
    private int columns;

    public MatrixManipulation(Matrix mat){
        this.matrix = mat.matrix;
        this.rows = mat.rows;
        this.columns = mat.columns;
    }

    // --- Functions ---

    // This code reverses the dimensions of the matrix. [3][4] becomes [4][3]
    public Matrix transpose(){
        double[][] temp = new double[columns][rows];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[j][i] = matrix[i][j];
            }
        }
        return new Matrix(temp);
    }

    // Simply converts matrix objects a 2 dimensional float array
    public double[][] convertToArr() {
        return matrix;
    }
}
