package com.bdlz.moodanalyser;

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else
            return null;
    }

    public static void main(String[] args) {
        String mood = MoodAnalyser.analyseMood("I am Happy");
        System.out.println(mood);
        mood = MoodAnalyser.analyseMood("I am Sad");
        System.out.println(mood);
    }
}
