package ucup.topekox;

import java.util.EnumSet;

/**
 * EnumSet adalah Set yang elemen datanya harus Enum
 * Karena data Enum itu unik, sehingga sangat cocok menggunakan Set dibandingkan List
 */

public class DemoEnumSet {
    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        for (var gender : genders) {
            System.out.println(gender);
        }
    }
}
