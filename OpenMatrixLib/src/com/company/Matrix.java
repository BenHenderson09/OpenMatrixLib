package com.company;

import java.util.Arrays;
import java.util.Random;

public class Matrix{
    Random rand = new Random();
    double[][] matrix;
    int rows;
    int columns;

    private MatrixInitialization matInitialization;
    private MatrixManipulation   matManipulation;
    private MatrixMaths          matMaths;

    Matrix(double[][] matrix){
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
    void setRandom(double min, double max){
        matInitialization.setRandom(min, max);
    }

    // Sets each entry in the matrix to a defined value
    void setConstant(double constant){
        matInitialization.setConstant(constant);
    }

    // --- Apply Mathematical Functions to Matrix Values ---

    Matrix matmul(Matrix newMat){
        return matMaths.matmul(newMat);
    }

    Matrix matdiv(Matrix newMat){
        return matMaths.matdiv(newMat);
    }


    Matrix add(Matrix newMat){
        return matMaths.add(newMat);
    }

    Matrix subtract(Matrix newMat){
        return matMaths.subtract(newMat);
    }

    Matrix multiplyConstant(double constant){
        return matMaths.multiplyConstant(constant);
    }

    Matrix divideConstant(double constant){
        return matMaths.divideConstant(constant);
    }

    Matrix subtractConstant(double constant){
        return matMaths.subtractConstant(constant);
    }

    Matrix addConstant(double constant){
        return matMaths.addConstant(constant);
    }

    double[] mean(){
        return matMaths.mean();
    }
    // --- Manipulate Matrix Values ---

    Matrix transpose(){
        return matManipulation.transpose();
    }

    double[][] convertToArr(){
        return matManipulation.convertToArr();
    }

    // Prints the matrix
    void print(){
        String output = Arrays.deepToString(matrix);
        System.out.println(output);
    }
}
