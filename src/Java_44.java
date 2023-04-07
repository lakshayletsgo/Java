//Date, Time and Calendar
// LocalDate and LocalTime is used just to simplify
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Java_44 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000); //Seconds
        System.out.println(System.currentTimeMillis()/1000/3600);   //Hours
        System.out.println(System.currentTimeMillis()/1000/3600/24);    //Days
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);    //Years
        Date d1= new Date();
        System.out.println(d1);
        System.out.println(Long.MAX_VALUE);

        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getTimeZone().getID());

        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        LocalDate l = LocalDate.now();
        System.out.println(l);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime l2= LocalDateTime.now();
        System.out.println(l2);


        LocalDateTime d2= LocalDateTime.now();
        System.out.println(d2);

//        This is just a formatter we have to pass this in some time to use it
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df3= DateTimeFormatter.ISO_LOCAL_DATE; //This is yyyy-mm-dd
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        String MyDate = d2.format(df);
        String MyDate2 = d2.format(df2);
        String MyDate3 = d2.format(df3);
        System.out.println(MyDate);
        System.out.println(MyDate2);
        System.out.println(MyDate3);
    }
}
