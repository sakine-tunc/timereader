package com.sakinetunc.timereader;

public class TurkishTimeReader implements TimeReader {
    private int convert24To12(int hour) {
        if (hour == 0) {
            return 12;
        } else if (hour > 12) {
            return hour - 12;
        } else {
            return hour;
        }
    }

    public String sayTime(String input) {
        /*
        LocalTime time = LocalTime.parse(input);
        int hour = time.getHour();
        int minute = time.getMinute();
        */

        String[] tokens = input.trim().split(":");
        int hour = Integer.valueOf(tokens[0]);
        int minute = Integer.valueOf(tokens[1]);

        if(hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException();
        }

        if (minute == 0) {
            return "Saat " + convert24To12(hour) + ".";
        } else if (minute == 15) {
            return "Saat " + convert24To12(hour) + " çeyrek geçiyor.";
        } else if (minute == 30) {
            return "Saat " + convert24To12(hour) + " buçuk.";
        } else if (minute == 45) {
            return "Saat " + convert24To12(hour + 1) + " çeyrek var.";
        } else if (minute < 30) {
            return "Saat " + convert24To12(hour) + " " + minute + " geçiyor.";
        } else {
            return "Saat " + convert24To12(hour + 1) + " " + (60 - minute) + " var.";
        }
    }
}
