package ucup.topekox;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert Name = ");
        String name = scanner.nextLine();

        System.out.print("Insert Age = ");
        Integer age = scanner.nextInt();


        System.out.println("Your Name is " + name);
        System.out.println("Your Age is " + age);

    }
}
