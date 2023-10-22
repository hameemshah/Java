package Basics;
public class Time {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));

        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Input";
        }
        int minutes, hours, remainingSeconds, remainingMinutes;
        String time;
            minutes = seconds / 60;
            remainingSeconds = seconds % 60;
            hours = minutes / 60;
            remainingMinutes = minutes % 60;
            time = hours + "h " + remainingMinutes +  "m " + remainingSeconds +  "s";
            return time;
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes <= 0 || seconds > 59) {
            return "Invalid Input";
        }
       return getDurationString(minutes * 60 + seconds);
    }
}
