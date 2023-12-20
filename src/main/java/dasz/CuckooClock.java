package dasz;

public class CuckooClock {
    public static String cuckooClock(String inputTime, int chimes) {
        int hours = Integer.parseInt(inputTime.split(":")[0]);
        int minutes = Integer.parseInt(inputTime.split(":")[1]);
        int chimesDone = 0;
        while (minutes % 15 != 0) minutes++;
        if (minutes == 0) chimesDone += hours;
        else if (minutes == 60) {
            if (hours == 12) hours = 1;
            else hours++;
            chimesDone += hours;
            minutes = 0;
        } else chimesDone++;
        while (chimesDone < chimes) {
            minutes += 15;
            if (minutes == 60) {
                if (hours == 12) hours = 1;
                else hours++;
                chimesDone += hours;
                minutes = 0;
            } else chimesDone++;
        }
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes);
    }
}
