package com.bdlz.moodanalyser;

public class MoodAnalysisException extends Exception {
    public String message;
    public ExceptionType exceptionType;

    public MoodAnalysisException(String message) {
        super(message);
    }
    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY;
    }
    public MoodAnalysisException(String message, ExceptionType type) {
        this.message=message;
        this.exceptionType=type;
    }

}