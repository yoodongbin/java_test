package sChap8;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalculateDate {
    private final long DAY_IN_MILLISECOND=1000*60*60*24;

    public static void main(String[] args) {
        CalculateDate cal = new CalculateDate();
        cal.compareDates();
    }
    private String getCalendarString(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        return year+"/"+(month+1)+"/"+date;
    }
    public void printDateGap(Calendar from, Calendar to) {
        long gap = (from.getTimeInMillis() - to.getTimeInMillis())/DAY_IN_MILLISECOND;
        if (gap < 0) {
            System.out.println("날짜를 다시 설정해주세요");
        } else {
            System.out.println("Day gap : " +getCalendarString(to)+" ~ "+getCalendarString(from)+" = "+ gap);
        }
    }
    public void compareDates() {
        Calendar from = new GregorianCalendar(2000,0,1);
        Calendar to = new GregorianCalendar(2000,11,31);
        printDateGap(from, to);
        printDateGap(to, from);
    }
}
