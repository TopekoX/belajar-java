package ucup.topekox;

import java.util.Random;

public class DemoRandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }
    }
}
