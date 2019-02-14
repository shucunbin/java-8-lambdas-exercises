package com.insightfullogic.java8.exercises.chapter3;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 只用reduce和Lambda表达式写出实现Stream上的filter操作的代码，如果不想返回Stream，可以返回一个List
 */
public class FilterUsingReduce {

    public static <I> List<I> filter(Stream<I> stream, Predicate<I> predicate) {
        List<I> initial = new ArrayList<>();
        return stream.reduce(initial, (List<I> acc, I x) -> {
            if (predicate.test(x)) {
                List<I> newAcc = new ArrayList(acc);
                newAcc.add(x);
                return newAcc;
            } else {
                return acc;
            }
        }, FilterUsingReduce::combineLists);
    }

    private static <I> List<I> combineLists(List<I> left, List<I> right) {
        // We are copying left to new list to avoid mutating it.
        List<I> newLeft = new ArrayList<>(left);
        newLeft.addAll(right);
        return newLeft;
    }

}
