package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }


    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.print("140 rubles are " + euro + " euro.");

        int inFirst = 140;
        int expectedFirst = 2;
        int outFirst = rubleToEuro(inFirst);
        boolean passedFirst = expectedFirst == outFirst;
        System.out.println(" Test result : " + passedFirst);

        int dollar = rubleToDollar(180);
        System.out.print("180 rubles are " + dollar + " dollar.");

        int inSecond = 180;
        int expectedSecond = 3;
        int outSecond = rubleToDollar(inSecond);
        boolean passedSecond = expectedSecond == outSecond;
        System.out.println(" Test result : " + passedSecond);

        int rubleE = euroToRuble(2);
        System.out.print("2 euro are " + rubleE + " rubles.");

        int inThird = 2;
        int expectedThird = 140;
        int outThird = euroToRuble(inThird);
        boolean passedThird = expectedThird == outThird;
        System.out.println(" Test result : " + passedThird);

        int rubleD = dollarToRuble(3);
        System.out.print("3 dollar are " + rubleD + " rubles.");

        int inFourth = 3;
        int expectedFourth = 180;
        int outFourth = dollarToRuble(inFourth);
        boolean passedFourth = expectedFourth == outFourth;
        System.out.println(" Test result : " + passedFourth);
    }
}
