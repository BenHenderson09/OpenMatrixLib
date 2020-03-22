package OML;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    Random rand = new Random();
    double[][] matrix;
    int rows;
    int columns;

    private MatrixInitialization matInitialization;
    private MatrixManipulation   matManipulation;
    private MatrixMaths          matMaths;

    public Matrix(int rows, int columns){
        this.matrix = new double[rows][columns];
        this.rows = rows;
        this.columns = columns;

        this.matInitialization = new MatrixInitialization(this);
        this.matManipulation   = new MatrixManipulation(this);
        this.matMaths          = new MatrixMaths(this);
    }

    public Matrix(double[][] matrix){
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;

        this.matInitialization = new MatrixInitialization(this);
        this.matManipulation   = new MatrixManipulation(this);
        this.matMaths          = new MatrixMaths(this);
    }

    // ----------------------------------------- Matrix Functions ---------------------------------

    // --- Initializing Matrix Values ---

    // Sets each entry in matrix to a random number between the defined min and max limits
    public void setRandom(double min, double max){
        matInitialization.setRandom(min, max);
    }

    // Sets each entry in the matrix to a defined value
    public void setConstant(double constant){
        matInitialization.setConstant(constant);
    }

    // --- Apply Mathematical Functions to Matrix Values ---

    public Matrix matmul(Matrix newMat){
        return matMaths.matmul(newMat);
    }

    public Matrix matdiv(Matrix newMat){
        return matMaths.matdiv(newMat);
    }

    public Matrix multiply(Matrix newMat) { return matMaths.multiply(newMat); }

    public Matrix add(Matrix newMat){
        return matMaths.add(newMat);
    }

    public Matrix subtract(Matrix newMat){
        return matMaths.subtract(newMat);
    }

    public Matrix multiplyConstant(double constant){
        return matMaths.multiplyConstant(constant);
    }

    public Matrix divideConstant(double constant){
        return matMaths.divideConstant(constant);
    }

    public Matrix subtractConstant(double constant){
        return matMaths.subtractConstant(constant);
    }

    public Matrix addConstant(double constant){
        return matMaths.addConstant(constant);
    }

    public double[] mean(){
        return matMaths.mean();
    }
    // --- Manipulate Matrix Values ---

    public Matrix transpose(){
        return matManipulation.transpose();
    }

    public double[][] convertToArr(){
        return matManipulation.convertToArr();
    }

    // Prints the matrix
    public void print(){
        String output = Arrays.deepToString(matrix);
        System.out.println(output);
    }
}
