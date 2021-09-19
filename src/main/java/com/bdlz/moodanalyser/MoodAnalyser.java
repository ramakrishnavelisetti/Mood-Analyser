package com.bdlz.moodanalyser;

public class MoodAnalyser {
    public static String message;

    public MoodAnalyser(String message)  {
        this.message = message;
    }

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {

        MoodAnalyser.message = message;
    }
    public MoodAnalyser() {

    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
