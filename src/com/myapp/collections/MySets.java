package com.myapp.collections;

import java.util.*;

public class MySets {

    public void mySets() {
        System.out.println("*****************************");
        System.out.println("Using Set.");
        System.out.println("*****************************");

        List<String> rawData = Arrays.asList(
                "https://google.com",
                "https://pluralsight.com", //
                "https://google.com",      // Duplicate
                "https://stackoverflow.com",
                "https://reddit.com/r/java",
                "https://medium.com",
                "https://pluralsight.com", // Duplicate
                "https://stackoverflow.com", // Duplicate
                "https://github.com",
                "https://reddit.com/r/java", // Duplicate
                "https://amazon.com",
                "https://github.com",      // Duplicate
                "https://linkedin.com",
                "https://google.com",      // Duplicate
                "https://medium.com"       // Duplicate
        );

        Set<String> uniqueData = new TreeSet<>(rawData);
        System.out.println("Unique Data: ");
        for (String u : uniqueData) {
            System.out.println(u);
        }

        System.out.println("Original Count: " + rawData.size());
        System.out.println("Unique Count: " + uniqueData.size());

    }
}
