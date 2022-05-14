package ucup.topekox;

import java.util.Calendar;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        // Problem
        Date tanggal = new Date();
        tanggal.setTime(278267020000L); // <- WTF

        System.out.println(tanggal);

        // Solution
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2011); // set tahun
        calendar.add(Calendar.YEAR, -1); // add untuk menambah atau mengurangi
        calendar.set(Calendar.MONTH, Calendar.AUGUST); // set bulan
        calendar.set(Calendar.HOUR_OF_DAY, 10); // set jam

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
