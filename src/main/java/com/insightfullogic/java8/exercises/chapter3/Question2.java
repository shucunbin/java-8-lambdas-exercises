package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;

public class Question2 {
    // Q3
    public static int countBandMembersInternal(List<Artist> artists) {
//        return artists.stream()
//                .map(artist -> artist.getMembers().count())
//                .reduce(0L,(acc,x) -> acc + x).intValue();

        return artists.stream()
                .map(artist -> artist.getMembers().count())
                .reduce(0L,Long::sum).intValue();
    }
}
