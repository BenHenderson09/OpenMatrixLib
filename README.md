# OpenMatrixLib (OML)

OpenMatrixLib is an open-source library created for development with matrices, OML is made for Java.

  - Matrix operations such as matrix-multiplication, transpose, mean average and more
  - Brilliant for use with data-science and specifically neural networks
  - Completely customizable with easy instructions for develoment

# Setup

Java is required, an IDE such as IntelliJ or Eclipse is highly reccomended.

### Options:
- Use the QuickStart project that comes with the repo
- Import the .Jar file yourself and get the library setup

### QuickStart:
Simply download the repository, go into your IDE of choice and choose to open a project. Then navigate to the location that you downloaded
the repo and open the folder "OpenMatrixLib_Quickstart". Inside this folder a project is setup with a console, main method and the library
is already imported. There is some sample code in the main method to get you started, but there will be a more in-depth guide further into
this README.

### Importing the .Jar
If you want to import the library yourself, this can be done differently depending on your project setup. You can do this through a 
command line or an IDE. Either way, you will need to add it as an external library. The following example is how you can do it with 
IntelliJ:

Go to:
>File -> Project Structure -> Modules -> Dependencies tab -> plus symbol -> JARS or directories -> the location of the .jar file
>you downloaded.

You should now notice that there is a new library in the "External Libraries" section of your project structure titled "OpenMatrixLib.jar".
To use this in your project just put the following line of code anywhere in your main class:
```
import com.whatever.Matrix;
```
# Usage
There are three main categories that OML provides:

Initialization | Manipulation   | Maths
-------------- | -------------- |------

## Initialization:
```java
public static void main(String[] args){
        // Creating our matrix with no values
        Matrix myMatrix = new Matrix(2,4);

        // Initializing our matrix
        // Setting the matrix values to a random double between 1 and 10
        myMatrix.setRandom(1,10);
        myMatrix.print();

        // Setting the matrix values to a constant value of 5
        myMatrix.setConstant(5);
        myMatrix.print();
    }
```
This outputs:
```java
Random:
[[9.677528864881396, 7.257672859463657, 2.6403945356603034, 8.998542274995973],
[9.483829762317958, 4.549202277340344, 2.932816027761715, 1.1962190976523979]]

Constant:
[[5.0, 5.0, 5.0, 5.0], 
[5.0, 5.0, 5.0, 5.0]]

```
## Manipulation:
```java
public static void main(String[] args){
       // Creating our matrix with no values
        Matrix myMatrix = new Matrix(2,4);

        // Initializing our matrix
        myMatrix.setConstant(4);
        myMatrix.print();
        
        // Transposing our matrix (reversing dimensions)
        myMatrix.transpose().print();
        
        // Converting our matrix to an array
         double[][] myDoubleArr = myMatrix.convertToArr();
         System.out.println(myDoubleArr[0][0]);
    }
```
This outputs:
```java
Normal:
[[4.0, 4.0, 4.0, 4.0],
[4.0, 4.0, 4.0, 4.0]]

Transposed:
[[4.0, 4.0],
[4.0, 4.0],
[4.0, 4.0],
[4.0, 4.0]]

Double Array:
4.0
```

## Maths:
```Java
 public static void main(String[] args){

        Matrix firstMatrix = new Matrix(2,4);
        firstMatrix.setConstant(4);

        // Creating a second matrix and setting each value to a random double between 1 and 5
        Matrix secondMatrix = new Matrix(4,2);
        secondMatrix.setRandom(1,5);

        // Using matrix multiplication
        firstMatrix.matmul(secondMatrix).print();
    }
```
This outputs:
```java
First Matrix:
[[4.0, 4.0, 4.0, 4.0],
[4.0, 4.0, 4.0, 4.0]]

Second Matrix:
[[2.4700115870937536, 1.8438646336262412],
[4.690646589884424, 2.8194436016966993],
[4.935156352356087, 1.2255837633571924],
[4.400805606108419, 4.602991314867676]]

Output Matrix:
[[65.98648071289062,41.967533111572266],
[65.98648071289062, 41.967533111572266]]
```
If you are not familiar with matrix multiplication this may seem like an odd result, but this the correct output. It will make a matrix
with the dimensions of the first matrix's rows x the second matrix's columns and then each element in the resulting matrix is the summed 
product of the rows in the first array multiplied by the columns in the second.

## Other Mathematical Functions
- matdiv() : divides two matrices by each other
- add() : adds two matrices
- subtract() : subtracts two matrices by each other
- multiplyConstant() : multiplies each value in a matrix by a constant value
- divideConstant() : divides each value in a matrix by a constant.
- addConstant() : adds a constant to each value in a matrix
- subtractConstant() : subtracts each value in a matrix by a constant
- mean() : returns a 1-dimensional array with the mean-average of each row.

# Contributing
Feel free to contribute, clean up some code or suggest some new features. It will always be appreciated. To start developing
just use the OpenMatrixLib_Dev folder, thanks.

