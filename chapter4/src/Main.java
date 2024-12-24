import nine.ComputerBig;
import six.Matrix;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3}, {1, 2, 1}, {1, 3, 2}};
        double[][] matrix2 = {{0, 1, 3}, {1, 2, 3}, {2, 0, 1}};
        Matrix a = new Matrix();
        System.out.println(a.add(matrix1,matrix2));
        System.out.println(a.subtract(matrix1,matrix2));
        System.out.println(a.transpose(matrix1));
        System.out.println(a.inverse(matrix2));

        BigInteger num1 = new BigInteger("123456789012345678901234567890");
        BigInteger num2 = new BigInteger("987654321098765432109876543210");
        ComputerBig computer = new ComputerBig(num1, num2);
        BigInteger sum = computer.add(num1, num2);
        System.out.println("和: " + sum);
        BigInteger difference = computer.subtract(num1, num2);
        System.out.println("差: " + difference);
        BigInteger product = computer.multiply(num1, num2);
        System.out.println("积: " + product);
        BigInteger quotient = computer.divide(num2, num1);
        System.out.println("商: " + quotient);
        BigInteger factorCountNum = new BigInteger("123456789012345678901234567890");
        int factorCount = computer.countFactors(factorCountNum);
        System.out.println("因子数"+ factorCount);
    }
}