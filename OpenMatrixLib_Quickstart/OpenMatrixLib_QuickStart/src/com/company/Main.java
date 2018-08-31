package com.company;
import com.company.Matrix;

/*
 * Made By Ben Henderson 2018
 */

public class Main {

    public static void main(String[] args) {

    /* A matrix is created with rows and columns,
       the first value (3) is the number of rows and the second
       value (5) is the number of columns
    */

        // Here we set the Matrix dimensions
        Matrix myMatrix = new Matrix(3,5);

        // Now we are initializing the matrix with random values between 1 and 10. Other operations are documented on github
        myMatrix.setRandom(1,10);

        // Now we print the matrix to the console
        myMatrix.print();
    }
}