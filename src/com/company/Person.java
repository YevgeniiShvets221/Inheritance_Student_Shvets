package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private  String first_name;
    private String last_name;
    private String patronymic;
    private String address;
    private long phone_number;
    private LocalDate day_of_birth;

    public Person() {
    }

    public Person(String first_name, String last_name, String patronymic, String address, long phone_number, LocalDate day_of_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone_number = phone_number;
        this.day_of_birth = day_of_birth;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public LocalDate getDay_of_birth() {
        return day_of_birth;
    }

    public void setDay_of_birth(LocalDate day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone_number=" + phone_number +
                ", day_of_birth=" + day_of_birth +
                '}';
    }

    public boolean isAdult() {
        int age= (int)ChronoUnit.YEARS.between(LocalDate.now(),this.getDay_of_birth());
        return age >=18;
    }
}
