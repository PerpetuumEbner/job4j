package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = true;
        if (finish <= 1) {
            return false;
        }
        for (int index = 2; index < finish; index++) {
            if (finish % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}