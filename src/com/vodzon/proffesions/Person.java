package com.vodzon.proffesions;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    protected String fullName;
    protected String birthday;

    public String getFullName() {
        return fullName;
    }

    public Person(String fullName, LocalDate birthday) {
        this.fullName = fullName;
        this.birthday = birthday.format(FORMATTER);
    }

    public int getAge() {
        LocalDate date = LocalDate.parse(birthday, FORMATTER);
        return Period.between(date, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + birthday +
                '}';
    }
}