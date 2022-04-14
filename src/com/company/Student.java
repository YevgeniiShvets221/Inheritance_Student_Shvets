package com.company;

import java.time.LocalDate;

public class Student extends Person{
    private String first_name;
    private String last_name;
    private String patronymic;
    private LocalDate day_of_birth;
    private int age;
    private long mobile_phone;
    private String university_name;
    private String faculty;
    private int course_number;
    private String speciality;
    private int average_mark;
    private String group;
    private int year_of_entrance;
    private int year_of_graduation;
    private char scholarship;
    private int amount_of_scholarship;
    private String nationality;
    private String city_of_birth;
    private int record_book_number;
    private String percentage_of_missed_lessons;
    private String getPercentage_of_visited_lessons;
    private String marital_status;
    private String number_of_credits;
    private String debts;
    private String number_in_rating;

    public Student(String first_name, String last_name, String patronymic, String address, long phone_number, LocalDate day_of_birth, String first_name1, String last_name1, String patronymic1, LocalDate day_of_birth1, int age, long mobile_phone, String university_name, String faculty, int course_number, String speciality, int average_mark, String group, int year_of_entrance, int year_of_graduation, char scholarship, int amount_of_scholarship, String nationality, String city_of_birth, int record_book_number, String percentage_of_missed_lessons, String getPercentage_of_visited_lessons, String marital_status, String number_of_credits, String debts, String number_in_rating) {
        super(first_name, last_name, patronymic, address, phone_number, day_of_birth);
        this.first_name = first_name1;
        this.last_name = last_name1;
        this.patronymic = patronymic1;
        this.day_of_birth = day_of_birth1;
        this.age = age;
        this.mobile_phone = mobile_phone;
        this.university_name = university_name;
        this.faculty = faculty;
        this.course_number = course_number;
        this.speciality = speciality;
        this.average_mark = average_mark;
        this.group = group;
        this.year_of_entrance = year_of_entrance;
        this.year_of_graduation = year_of_graduation;
        this.scholarship = scholarship;
        this.amount_of_scholarship = amount_of_scholarship;
        this.nationality = nationality;
        this.city_of_birth = city_of_birth;
        this.record_book_number = record_book_number;
        this.percentage_of_missed_lessons = percentage_of_missed_lessons;
        this.getPercentage_of_visited_lessons = getPercentage_of_visited_lessons;
        this.marital_status = marital_status;
        this.number_of_credits = number_of_credits;
        this.debts = debts;
        this.number_in_rating = number_in_rating;
    }

    public Student(String first_name, String last_name, String patronymic, LocalDate day_of_birth, int age, long mobile_phone, String university_name, String faculty, int course_number, String speciality, int average_mark, String group, int year_of_entrance, int year_of_graduation, char scholarship, int amount_of_scholarship, String nationality, String city_of_birth, int record_book_number, String percentage_of_missed_lessons, String getPercentage_of_visited_lessons, String marital_status, String number_of_credits, String debts, String number_in_rating) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
        this.day_of_birth = day_of_birth;
        this.age = age;
        this.mobile_phone = mobile_phone;
        this.university_name = university_name;
        this.faculty = faculty;
        this.course_number = course_number;
        this.speciality = speciality;
        this.average_mark = average_mark;
        this.group = group;
        this.year_of_entrance = year_of_entrance;
        this.year_of_graduation = year_of_graduation;
        this.scholarship = scholarship;
        this.amount_of_scholarship = amount_of_scholarship;
        this.nationality = nationality;
        this.city_of_birth = city_of_birth;
        this.record_book_number = record_book_number;
        this.percentage_of_missed_lessons = percentage_of_missed_lessons;
        this.getPercentage_of_visited_lessons = getPercentage_of_visited_lessons;
        this.marital_status = marital_status;
        this.number_of_credits = number_of_credits;
        this.debts = debts;
        this.number_in_rating = number_in_rating;
    }

    public Student() {
    }

    @Override
    public String getFirst_name() {
        return first_name;
    }

    @Override
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Override
    public String getLast_name() {
        return last_name;
    }

    @Override
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public LocalDate getDay_of_birth() {
        return day_of_birth;
    }

    @Override
    public void setDay_of_birth(LocalDate day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(long mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse_number() {
        return course_number;
    }

    public void setCourse_number(int course_number) {
        this.course_number = course_number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getAverage_mark() {
        return average_mark;
    }

    public void setAverage_mark(int average_mark) {
        this.average_mark = average_mark;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYear_of_entrance() {
        return year_of_entrance;
    }

    public void setYear_of_entrance(int year_of_entrance) {
        this.year_of_entrance = year_of_entrance;
    }

    public int getYear_of_graduation() {
        return year_of_graduation;
    }

    public void setYear_of_graduation(int year_of_graduation) {
        this.year_of_graduation = year_of_graduation;
    }

    public char getScholarship() {
        return scholarship;
    }

    public void setScholarship(char scholarship) {
        this.scholarship = scholarship;
    }

    public int getAmount_of_scholarship() {
        return amount_of_scholarship;
    }

    public void setAmount_of_scholarship(int amount_of_scholarship) {
        this.amount_of_scholarship = amount_of_scholarship;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity_of_birth() {
        return city_of_birth;
    }

    public void setCity_of_birth(String city_of_birth) {
        this.city_of_birth = city_of_birth;
    }

    public int getRecord_book_number() {
        return record_book_number;
    }

    public void setRecord_book_number(int record_book_number) {
        this.record_book_number = record_book_number;
    }

    public String getPercentage_of_missed_lessons() {
        return percentage_of_missed_lessons;
    }

    public void setPercentage_of_missed_lessons(String percentage_of_missed_lessons) {
        this.percentage_of_missed_lessons = percentage_of_missed_lessons;
    }

    public String getGetPercentage_of_visited_lessons() {
        return getPercentage_of_visited_lessons;
    }

    public void setGetPercentage_of_visited_lessons(String getPercentage_of_visited_lessons) {
        this.getPercentage_of_visited_lessons = getPercentage_of_visited_lessons;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getNumber_of_credits() {
        return number_of_credits;
    }

    public void setNumber_of_credits(String number_of_credits) {
        this.number_of_credits = number_of_credits;
    }

    public String getDebts() {
        return debts;
    }

    public void setDebts(String debts) {
        this.debts = debts;
    }

    public String getNumber_in_rating() {
        return number_in_rating;
    }

    public void setNumber_in_rating(String number_in_rating) {
        this.number_in_rating = number_in_rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", day_of_birth=" + day_of_birth +
                ", age=" + age +
                ", mobile_phone=" + mobile_phone +
                ", university_name='" + university_name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course_number=" + course_number +
                ", speciality='" + speciality + '\'' +
                ", average_mark=" + average_mark +
                ", group='" + group + '\'' +
                ", year_of_entrance=" + year_of_entrance +
                ", year_of_graduation=" + year_of_graduation +
                ", scholarship=" + scholarship +
                ", amount_of_scholarship=" + amount_of_scholarship +
                ", nationality='" + nationality + '\'' +
                ", city_of_birth='" + city_of_birth + '\'' +
                ", record_book_number=" + record_book_number +
                ", percentage_of_missed_lessons='" + percentage_of_missed_lessons + '\'' +
                ", getPercentage_of_visited_lessons='" + getPercentage_of_visited_lessons + '\'' +
                ", marital_status='" + marital_status + '\'' +
                ", number_of_credits='" + number_of_credits + '\'' +
                ", debts='" + debts + '\'' +
                ", number_in_rating='" + number_in_rating + '\'' +
                '}';
    }
}
