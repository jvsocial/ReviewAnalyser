package com.simplilearn.ReviewAnalyser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReviewAnalyserApplicationTests {

    private final ReviewAnalyserApplication analyser = new ReviewAnalyserApplication();

    @Test	 
    public void testWordCount() {
        assertEquals(7, analyser.getWordCount("Train to win in the digital economy"));	 
    }
}
