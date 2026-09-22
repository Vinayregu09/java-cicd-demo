package com.fun;

import java.util.List;
import java.util.Random;

/** Developer Excuse Generator 3000 - because it's never your fault. */
public class ExcuseGenerator {

    public static final String VERSION = "1.0.0";

    public static final List<String> EXCUSES = List.of(
            "It works on my machine.",
            "That's not a bug, it's a feature.",
            "Mercury is in retrograde.",
            "The intern pushed to main.",
            "I was just about to fix that.",
            "The cache did it.",
            "It's a DNS issue. It's always DNS.",
            "Someone must have changed my code."
    );

    private static final Random RANDOM = new Random();

    /** Returns a random excuse for your broken build. */
    public static String getExcuse() {
        return EXCUSES.get(RANDOM.nextInt(EXCUSES.size()));
    }

    /** Predicts developer productivity based on coffee intake. */
    public static String coffeeMood(int cups) {
        if (cups < 0) {
            throw new IllegalArgumentException("You can't un-drink coffee.");
        }
        if (cups == 0) {
            return "Zombie mode";
        }
        if (cups <= 2) {
            return "Functional human";
        }
        if (cups <= 4) {
            return "10x developer";
        }
        return "Can hear colors";
    }

    /** Converts number of bugs into an appropriate panic level (0-10). */
    public static int bugCountToPanic(int bugs) {
        return Math.min(bugs, 10);
    }

    public static void main(String[] args) {
        System.out.println("Excuse Generator v" + VERSION);
        System.out.println("Today's excuse: " + getExcuse());
        System.out.println("Mood after 3 coffees: " + coffeeMood(3));
    }
}