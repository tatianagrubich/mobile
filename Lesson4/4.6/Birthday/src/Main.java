import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Calendar.YEAR;

public class Main {
    public static int getCurrentYear()
        {
            java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
            calendar.setTime(new java.util.Date());
            return calendar.get(YEAR);
        }

    public static void main(String args[])
    {
        int k=0;
        int n=1;
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy-EEEE");
        Calendar calendar = new GregorianCalendar(1984, Calendar.OCTOBER , 04);
        Date date = calendar.getTime();

        Calendar calendar1 = Calendar.getInstance();

        System.out.println(k+"-"+dateFormat.format(date));
        while (calendar.compareTo(calendar1)<=0)

        {
            k++;
            calendar.add(YEAR,n);
            date = calendar.getTime();
            System.out.println(k+"-"+dateFormat.format(date));

        }


    }
}
