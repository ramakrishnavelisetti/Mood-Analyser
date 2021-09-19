package com.bdlz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        MoodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }
    @Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        MoodAnalyser.setMessage("I am in Any Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }
    @Test
    public void givenMessage_Null_ShouldThrowMoodAnalysisException() {
        try {
           MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            MoodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }

}