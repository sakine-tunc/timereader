package com.sakinetunc.timereader;

public class Main {
    public static void main(String[] args) {
        TimeReader timeReader;
        String time;

        if(args.length == 1) {
            time = args[0];
            timeReader = new TurkishTimeReader();
        } else if(args.length == 2) {
            time = args[1];

            if(args[0].equals("en")) {
                timeReader = new EnglishTimeReader();
            } else {
                timeReader = new TurkishTimeReader();
            }
        } else {
            return;
        }

        String text = timeReader.sayTime(time);
        System.out.println(text);
    }
}
