package OML;

import java.util.Random;

public class MatrixMaths {
    private Random rand = new Random();
    private double[][] matrix;
    private int rows;
    private int columns;

    public MatrixMaths(Matrix mat){
        this.matrix = mat.matrix;
        this.rows = mat.rows;
        this.columns = mat.columns;
    }

    // --- Basic Matrix Mathematical Functions (*, / , +, -) ---

    public Matrix matmul(Matrix newMat){

        // Check matrix dimensions
        if (rows != newMat.columns && columns != newMat.rows){
            throw new ArithmeticException("The provided matrix dimensions are incompatible.");
        }


        double[][] temp = new double[rows][newMat.columns];

        // Initializing array with 0 value in each element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < newMat.columns; j++) {
                temp[i][j] = 0f;
            }
        }

        // Multiplying the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < newMat.columns; j++) {
                double[] products = new double[columns];
                for (int k = 0; k < columns; k++) {
                    products[k] = matrix[i][k] * newMat.matrix[k][j];
                }
                float sum = 0;
                for (double value : products) {
                    sum += value;
                }
                temp[i][j] = sum;
            }
        }

        return new Matrix(temp);
    }

    public Matrix matdiv(Matrix newMat){
        // Checking matrix dimensions
        if (rows != newMat.rows || columns != newMat.columns){
            throw new ArithmeticException("The matrix dimensions are incompatible for division, they must have the same dimensions.");
        }

        double[][] temp = new double[rows][columns];

        // Dividing each element of a matrix by the same indexed element of the other matrix
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[i][j] = matrix[i][j] / newMat.matrix[i][j];
            }
        }

        return new Matrix(temp);
    }

    public Matrix multiply(Matrix newMat){
        // Checking matrix dimensions
        if (rows != newMat.rows || columns != newMat.columns){
            throw new ArithmeticException("The matrix dimensions are incompatible for multiplication, they must have the same dimensions.");
        }

        double[][] temp = new double[rows][columns];

        // Adding each element of a matrix to the same indexed element of the other matrix
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[i][j] = matrix[i][j] * newMat.matrix[i][j];
            }
        }

        return new Matrix(temp);
    }

    public Matrix add(Matrix newMat){
        // Checking matrix dimensions
        if (rows != newMat.rows || columns != newMat.columns){
            throw new ArithmeticException("The matrix dimensions are incompatible for addition, they must have the same dimensions.");
        }

        double[][] temp = new double[rows][columns];

        // Adding each element of a matrix to the same indexed element of the other matrix
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[i][j] = matrix[i][j] + newMat.matrix[i][j];
            }
        }

        return new Matrix(temp);
    }

    public Matrix subtract(Matrix newMat){
        // Checking matrix dimensions
        if (rows != newMat.rows || columns != newMat.columns){
            throw new ArithmeticException("The matrix dimensions are incompatible for subtraction, they must have the same dimensions.");
        }

        double[][] temp = new double[rows][columns];

        // Subtracting each element of a matrix to the same indexed element of the other matrix
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[i][j] = matrix[i][j] - newMat.matrix[i][j];
            }
        }

        return new Matrix(temp);
    }

    // --- Constant matrix functions ([][]*i, [][]/i, etc ) ---

    public Matrix multiplyConstant(double constant){
        double[][] temp = new double[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[i][j] = matrix[i][j]*constant;
            }
        }
        return new Matrix(temp);
    }

    public Matrix divideConstant(double constant){
        double[][] temp = new double[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[i][j] = matrix[i][j]/constant;
            }
        }
        return new Matrix(temp);
    }

    public Matrix addConstant(double constant){
        double[][] temp = new double[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[i][j] = matrix[i][j]+constant;
            }
        }
        return new Matrix(temp);
    }

    public Matrix subtractConstant(double constant){
        double[][] temp = new double[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                temp[i][j] = matrix[i][j]-constant;
            }
        }
        return new Matrix(temp);
    }

    // --- Averages ---
    // --- Averages ---
    public double[] mean(){
        double[] temp = new double[rows];

        for (int i = 0; i < rows; i++){
            double avrg = 0;
            for (int j = 0; j < columns; j++){
                avrg += matrix[i][j] / columns;
            }
            temp[i] = avrg;
        }
        return temp;
    }
}
