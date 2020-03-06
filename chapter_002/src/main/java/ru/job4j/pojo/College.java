package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Иванов");
        student.setName("Иван");
        student.setPatronymic("Иванович");
        student.setGroupNumber(8);
        student.setDate("01.01.2020");

        System.out.println(String.format("Студент %s %s %s поступил в группу %s %s.", student.getName(), student.getName(), student.getPatronymic(), student.getGroupNumber(), student.getDate()));
    }
}
