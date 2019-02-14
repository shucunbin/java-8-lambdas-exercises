package com.insightfullogic.java8.exercises.chapter3;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringExercises {

    // Question 7：计算一个字符串中小写字母的个数
    public static int countLowercaseLetters(String string) {
        return (int) string.chars().filter(Character::isLowerCase).count();
    }

    // Question 8：在一个字符串列表中，找出包含最多小写字母的字符串。对于空列表，返回Optional<String>对象
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparing(s -> s.chars()
                        .filter(Character::isLowerCase)
                        .count()));
    }

}
