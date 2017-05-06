package com.javaSE.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * 其它类用的一个 javaBean
 */
public class Person {
    public static enum Gender {
        MALE, FEMALE
    }

    private Integer id;
    private String name;
    private Double income;
    private LocalDate birthDate;
    // 表示性别的。
    private Gender gender;

    public Person(Integer id, String name, Double income, LocalDate birthDate, Gender gender) {
        this.id = id;
        this.name = name;
        this.income = income;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    // 判断 是不是 男
    public Boolean isMale() {
        return this.gender == Gender.MALE;
    }

    // 判断 是不是 女
    public Boolean isFeMale() {
        return this.gender == Gender.FEMALE;
    }

    public static List<Person> peoples() {
        Person p1 = new Person(1, "kobe1", 2100D, LocalDate.of(1993, 3, 9), Gender.MALE);
        Person p2 = new Person(2, "kobe2", 2200D, LocalDate.of(1994, 4, 10), Gender.FEMALE);
        Person p3 = new Person(3, "kobe3", 2300D, LocalDate.of(1995, 5, 11), Gender.MALE);
        Person p4 = new Person(4, "kobe4", 2400D, LocalDate.of(1996, 6, 12), Gender.FEMALE);
        Person p5 = new Person(5, "kobe5", 2500D, LocalDate.of(1997, 7, 13), Gender.MALE);
        return Arrays.asList(p1,p2,p3,p4,p5);
    }

    @Override
    public String toString() {
        return String.format("(%d,%s,%s,%s,%s)",id,name,income,birthDate,gender);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
