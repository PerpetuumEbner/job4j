package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                System.out.println("Found!");
                rsl = index;
                System.out.println(rsl);
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Not Found!");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"element1", "element2", "element3", "element4"}, "element2");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}