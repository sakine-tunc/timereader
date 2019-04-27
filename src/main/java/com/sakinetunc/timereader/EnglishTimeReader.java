package com.sakinetunc.timereader;

public class EnglishTimeReader implements TimeReader {
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
        String[] tokens = input.trim().split(":");
        int hour = Integer.valueOf(tokens[0]);
        int minute = Integer.valueOf(tokens[1]);

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException();
        }

        if (minute == 0) {
            return "It's " + convert24To12(hour) + " o'clock.";
        } else if (minute == 15) {
            return "It's quarter past " + convert24To12(hour) + ".";
        } else if (minute == 30) {
            return "It's half past " + convert24To12(hour) + ".";
        } else if (minute == 45) {
            return "It's quarter to " + convert24To12(hour + 1) + ".";
        } else if (minute < 30) {
            return "It's " + minute + " past " + convert24To12(hour) + ".";
        } else {
            return "It's " + (60 - minute) + " to " + +convert24To12(hour + 1) + ".";
        }
    }
}
