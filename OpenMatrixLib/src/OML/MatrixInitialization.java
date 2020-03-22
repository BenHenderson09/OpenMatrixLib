package OML;

import java.util.Random;

public class MatrixInitialization {
    private Random rand = new Random();
    private double[][] matrix;
    private int rows;
    private int columns;

    public MatrixInitialization(Matrix mat){
        this.matrix = mat.matrix;
        this.rows = mat.rows;
        this.columns = mat.columns;
    }

    // --- Functions ---

    // Sets each entry in matrix to a random number between the defined min and max limits
    public void setRandom(double min, double max){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = min + rand.nextDouble() * (max - min);
            }
        }
    }

    // Sets each entry in the matrix to a defined value
    public void setConstant(double constant){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = constant;
            }
        }
    }
}
