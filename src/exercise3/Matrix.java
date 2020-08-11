package exercise3;

public class Matrix {
    double[][] matrix;
    int rowsNumber;
    int colsNumber;

    public Matrix(int rowsNumber, int colsNumber) {
        this.rowsNumber = rowsNumber;
        this.colsNumber = colsNumber;
        this.matrix = new double[rowsNumber][colsNumber];
    }

    public Matrix() {
        this.rowsNumber = 0;
        this.colsNumber = 0;
        this.matrix = new double[rowsNumber][colsNumber];
    }

    public int getColsNumber() {
        return colsNumber;
    }

    public int getRowsNumber() {
        return rowsNumber;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setColsNumber(int colsNumber) {
        this.colsNumber = colsNumber;
    }

    public void setRowsNumber(int rowsNumber) {
        this.rowsNumber = rowsNumber;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public void fillMatrix(double lowerValue, double upperValue) {
        for (int i = 0; i<this.rowsNumber; i++)
            for (int j = 0; j<this.colsNumber; j++)
                this.matrix[i][j] = lowerValue + (double)((upperValue-lowerValue+1)*Math.random());
    }

    public void printMatrix() {
        for (int i = 0; i< this.rowsNumber; i++) {
            for (int j = 0; j < this.colsNumber; j++)
                System.out.printf("%.2f  ", this.matrix[i][j]);
            System.out.println();
        }
    }

    public Matrix addMatrix(Matrix array) {
        if (array.rowsNumber == this.rowsNumber && array.colsNumber == this.colsNumber)
        {
            Matrix result = new Matrix(this.rowsNumber, this.colsNumber);
            for (int i=0; i<this.rowsNumber; i++)
                for (int j=0; j<this.colsNumber; j++)
                    result.matrix[i][j] = this.matrix[i][j] + array.matrix[i][j];
            return result;
        }
        else
            return null;
    }

    public Matrix multiplicateOnNumber(int n) {
        Matrix result = new Matrix(this.rowsNumber, this.colsNumber);
        for (int i=0; i<this.rowsNumber; i++)
            for (int j=0; j<this.colsNumber; j++)
                result.matrix[i][j] = n*this.matrix[i][j];
        return result;
    }

    public Matrix multiplicateOnMatrix(Matrix array) {
        if (this.colsNumber == array.rowsNumber)
        {
            double sum;
            Matrix result = new Matrix(this.rowsNumber, array.colsNumber);
            for (int i=0; i<result.rowsNumber; i++)
                for (int j=0; j<result.colsNumber; j++)
                {
                    sum = 0;
                    for (int k=0; k< this.colsNumber; k++)
                        sum+=this.matrix[i][k] * array.matrix[k][j];
                    result.matrix[i][j] = sum;
                }
            return result;
        }
        else
            return null;
    }
}
