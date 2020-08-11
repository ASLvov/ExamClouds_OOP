package exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Matrix array1 = new Matrix(3,2);
        array1.fillMatrix(0, 9);
        System.out.println("Матрица №1: ");
        array1.printMatrix();
        System.out.println();
        System.out.println("Матрица №2, полученная в результате умножения первой на 3: ");
        Matrix array2 = array1.multiplicateOnNumber(3);
        array2.printMatrix();
        System.out.println();
        System.out.println("Матрица №3, полученная в результате сложения матриц 1 и 2 ");
        Matrix array3 = array1.addMatrix(array2);
        array3.printMatrix();
        System.out.println();
        Matrix array4 = new Matrix(2,3);
        array4.fillMatrix(1, 5);
        System.out.println("Матрица №4: ");
        array4.printMatrix();
        System.out.println();
        System.out.println("Матрица №5, полученная в результате умножения матрицы 1 на матрицу 4: ");
        Matrix array5 = array1.multiplicateOnMatrix(array4);
        array5.printMatrix();
    }
}
