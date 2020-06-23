package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> set = new HashSet<>();
        for (String dep : deps) {
            String string = "";
            for (String splitDep : dep.split("/")) {
                if (string.isEmpty()) {
                    string = splitDep;
                } else {
                    string = string + "/" + splitDep;
                }
                set.add(string);
            }
        }
        return new ArrayList<>(set);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}