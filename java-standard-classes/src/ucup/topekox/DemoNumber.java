package ucup.topekox;

public class DemoNumber {
    public static void main(String[] args) {
        Integer value = 10;

        // konversi nilai Integer ke Long dan Double
        Long longValue = value.longValue();
        Double doubleValue = value.doubleValue();

        System.out.println("value long = " + longValue + ", type = " + longValue.getClass());
        System.out.println("value double = " + doubleValue + ", type = " + doubleValue.getClass());

        // String ke Number
        String nilai = "1000";

        // jika pritif gunakan Integer.parseInt
        Integer contohInt = Integer.valueOf(nilai);

        System.out.println(contohInt + " : " + contohInt.getClass());
    }
}
