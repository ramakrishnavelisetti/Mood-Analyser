package com.bdlz.moodanalyser;

public class MoodAnalyser {
    public static String message;

    public MoodAnalyser(String message) throws MoodAnalysisException {
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

    public static String analyseMood() throws MoodAnalysisException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Entered Invalid Mood",
                    MoodAnalysisException.ExceptionType.ENTERED_NULL);
        }
    }
}
