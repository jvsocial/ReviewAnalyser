package com.simplilearn.ReviewAnalyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReviewAnalyserApplication {
    
    public static double getWordCount(String review) {
        int count = 0;
        
        String[] words = review.toLowerCase().split("[,.\\s]+");
        for (String word : words) {
            count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ReviewAnalyserApplication.class, args);
