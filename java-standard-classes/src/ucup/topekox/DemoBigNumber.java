package ucup.topekox;

import java.math.BigInteger;

public class DemoBigNumber {
    public static void main(String[] args) {
        // valuenya String
        BigInteger a = new BigInteger("100000000000000000000000");
        BigInteger b = new BigInteger("100000000000000000000000");

        // jangan gunakan a + b
        BigInteger c = a.add(b);
        System.out.println(c);
    }
}
