package com.mindera.mindswap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        --------------Requirements---------------
        The prayer above was infected by trash.
        Remove the trash, and print it in uppercase.

         */

        String prayer = """
                Oh Lord, won't you buy me a trash Mercedes Benz
                My friends all drive trash Porsche's, I must make trash amends
                Worked hard all my trash lifetime, no help from my trash friends
                So Lord, won't you buy me a trash Mercedes Benz""";

        String noTrash = Arrays.stream(prayer.split("\\s+"))
                .filter(s -> !s.equalsIgnoreCase("trash"))
                .map(String::toUpperCase)
                .reduce("", (acc, element) -> acc + " " + element);

        System.out.println(noTrash);
    }
}
