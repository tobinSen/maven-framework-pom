package com.example.exam.config;

import com.google.common.collect.ComparisonChain;
import org.apache.commons.lang3.RandomStringUtils;

public class ExamDemo {

    public static void main(String[] args) {
        int result = ComparisonChain.start().compare(1, 4).result();
        System.out.println("result: " + result);

        System.out.println("random: " + RandomStringUtils.randomNumeric(4));

        System.out.println("random: " + RandomStringUtils.randomNumeric(5));
    }
}
