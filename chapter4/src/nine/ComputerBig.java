package nine;
import java.math.BigInteger;
public class ComputerBig {
    private BigInteger num1;
    private BigInteger num2;

    public ComputerBig(BigInteger num1, BigInteger num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public BigInteger add(BigInteger num1,BigInteger num2) {
        return num1.add(num2);
    }

    public BigInteger subtract(BigInteger num1,BigInteger num2) {
        return num1.subtract(num2);
    }

    public BigInteger multiply(BigInteger num1,BigInteger num2) {
        return num1.multiply(num2);
    }

    public BigInteger divide(BigInteger num1,BigInteger num2) {
        return num1.divide(num2);
    }

    public int countFactors(BigInteger num) {

        int count = 0;
        BigInteger two = BigInteger.valueOf(2);
        BigInteger sqrtNum = num.sqrt();

        for (BigInteger i = two; i.compareTo(sqrtNum) <= 0; i = i.add(BigInteger.ONE)) {
            if (num.remainder(i).equals(BigInteger.ZERO)) {
                count++;
                if (!i.equals(num.divide(i))) { // 如果是平方数，避免重复计数
                    count++;
                }
            }
        }
        return count;
    }
}
