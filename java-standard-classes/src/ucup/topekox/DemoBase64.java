package ucup.topekox;

import java.util.Base64;

public class DemoBase64 {
    public static void main(String[] args) {
        String text = "Ucup Topekox";

        // encode
        String encode = Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println(encode);

        // decode
        byte[] bytes = Base64.getDecoder().decode(encode);
        String decode = new String(bytes);
        System.out.println(decode);
    }
}
