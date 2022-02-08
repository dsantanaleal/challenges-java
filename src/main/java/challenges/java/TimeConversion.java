package challenges.java;

public class TimeConversion {

    public static String timeConversion(String s) {
        String journey = s.substring(8);
        String strHour = s.substring(0,2);
        int hour12 = Integer.parseInt(strHour);
        if((journey.equals("AM") && hour12 < 12) || (journey.equals("PM") && hour12 == 12)) {
            return s.substring(0,8);
        }
        String complement = s.substring(2,8);
        int hour24 = hour12 + 12;
        if(hour24 == 24){
            return "00"+complement;
        }
        return hour24+complement;
    }

    public static void main(String args[]) {
        System.out.println(timeConversion("12:05:45AM").equals("00:05:45"));
        System.out.println(timeConversion("01:05:45AM").equals("01:05:45"));
        System.out.println(timeConversion("02:05:45AM").equals("02:05:45"));
        System.out.println(timeConversion("03:05:45AM").equals("03:05:45"));
        System.out.println(timeConversion("04:05:45AM").equals("04:05:45"));
        System.out.println(timeConversion("05:05:45AM").equals("05:05:45"));
        System.out.println(timeConversion("06:05:45AM").equals("06:05:45"));
        System.out.println(timeConversion("07:05:45AM").equals("07:05:45"));
        System.out.println(timeConversion("08:05:45AM").equals("08:05:45"));
        System.out.println(timeConversion("09:05:45AM").equals("09:05:45"));
        System.out.println(timeConversion("10:05:45AM").equals("10:05:45"));
        System.out.println(timeConversion("11:05:45AM").equals("11:05:45"));
        System.out.println(timeConversion("12:05:45PM").equals("12:05:45"));
        System.out.println(timeConversion("01:05:45PM").equals("13:05:45"));
        System.out.println(timeConversion("02:05:45PM").equals("14:05:45"));
        System.out.println(timeConversion("03:05:45PM").equals("15:05:45"));
        System.out.println(timeConversion("04:05:45PM").equals("16:05:45"));
        System.out.println(timeConversion("05:05:45PM").equals("17:05:45"));
        System.out.println(timeConversion("06:05:45PM").equals("18:05:45"));
        System.out.println(timeConversion("07:05:45PM").equals("19:05:45"));
        System.out.println(timeConversion("08:05:45PM").equals("20:05:45"));
        System.out.println(timeConversion("09:05:45PM").equals("21:05:45"));
        System.out.println(timeConversion("10:05:45PM").equals("22:05:45"));
        System.out.println(timeConversion("11:05:45PM").equals("23:05:45"));

    }
}
