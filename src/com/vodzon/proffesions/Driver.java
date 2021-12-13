package com.vodzon.proffesions;

import java.time.LocalDate;

public class Driver extends Person {

    private final int experience;

    public int getExperience() {
        return experience;
    }

    public Driver(String fullName, LocalDate birthday, int experience) {
        super(fullName, birthday);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}