package com.bdlz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
        Assert.assertEquals("SAD", actualResult);
    }
    @Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", actualResult);
    }
}