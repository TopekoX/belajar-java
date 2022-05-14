package ucup.topekox;

public class DemoStringBuffer {

    public static void main(String[] args) {
        // fungsinya agar tidak terlalu banyak membuat objek string
        StringBuilder builder = new StringBuilder();
        builder.append("Ucup");
        builder.append(" ");
        builder.append("Topekox");

        String name = builder.toString();

        System.out.println("Name : " + name);

    }
}
