package com.bdlz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }
    @Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }
}