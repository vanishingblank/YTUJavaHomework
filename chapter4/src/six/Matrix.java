package six;

public class Matrix {
    public static double[][] add(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static double[][] transpose(double[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    public static double[][] inverse(double[][] matrix1) {
        double[][] c = new double[3][3];

        double det = matrix1[0][0] * (matrix1[1][1] * matrix1[2][2] - matrix1[1][2] * matrix1[2][1]) -
                matrix1[0][1] * (matrix1[1][0] * matrix1[2][2] - matrix1[1][2] * matrix1[2][0]) +
                matrix1[0][2] * (matrix1[1][0] * matrix1[2][1] - matrix1[1][1] * matrix1[2][0]);


        c[0][0] = matrix1[1][1] * matrix1[2][2] - matrix1[1][2] * matrix1[2][1];
        c[0][1] = matrix1[1][0] * matrix1[2][2] - matrix1[1][2] * matrix1[2][0];
        c[0][2] = matrix1[1][0] * matrix1[2][1] - matrix1[1][1] * matrix1[2][0];
        c[1][0] = matrix1[0][1] * matrix1[2][2] - matrix1[0][2] * matrix1[2][1];
        c[1][1] = matrix1[0][0] * matrix1[2][2] - matrix1[0][2] * matrix1[2][0];
        c[1][2] = matrix1[0][0] * matrix1[2][1] - matrix1[0][1] * matrix1[2][0];
        c[2][0] = matrix1[0][1] * matrix1[1][2] - matrix1[0][2] * matrix1[1][1];
        c[2][1] = matrix1[0][0] * matrix1[1][2] - matrix1[0][2] * matrix1[1][0];
        c[2][2] = matrix1[0][0] * matrix1[1][1] - matrix1[0][1] * matrix1[1][0];

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = c[i][j] / det;
            }
        }
        return inverse;
    }
}
