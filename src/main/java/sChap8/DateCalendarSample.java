package sChap8;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendarSample {
    public static void main(String[] args) {
        DateCalendarSample sample = new DateCalendarSample();
//        sample.checkDate();
//        sample.makeCalendarObject();

    }

    private void addAndRoll(Calendar calendar, int amount) {
    }

    private void makeCalendarObject() {
        Calendar cal = Calendar.getInstance();
        Calendar greCal = new GregorianCalendar(); //<- 여기서 더 선호해야 하는 방법 !!!!!
        System.out.println("cal 출력 : "+cal.getTime());
        System.out.println("cal 출력 : "+greCal.getTime());

        int year = greCal.get(Calendar.YEAR);
        System.out.println(year);


        addAndRoll(greCal, 10);
    }

    private void checkDate() {
        Date date = new Date();
        System.out.println("date : "+date);

        long time = date.getTime();
        System.out.println("long-time : "+time);

        date.setTime(0);
        System.out.println("setTime(0) : "+date);
    }


}
