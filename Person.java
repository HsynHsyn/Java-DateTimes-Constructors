package Muhtar_SDET.Day25_DateTimes_Continue_ConstructorsIntro;

import java.time.LocalDate;

public class Person {

    public String name;
    public char gender;
    public int dateOfBirth;
    public LocalDate date;
    public boolean isMarried, isEmployed;


    public Person(String name, char gender, int dateOfBirth, LocalDate date, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.date = date;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);

    }

    public void sleeping(){
        System.out.println(name + " is sleeping" );

    }

    public void drinking(String drink){
        System.out.println(name + " is drinking " + drink);

    }

    public void calAge() {
        System.out.println(name + "s age is : " + (date.getYear() - dateOfBirth) + " years old");

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", date=" + date +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }
}

/*

name, age,  gender, dateOfBirth, isMarried, isEmployed
Add a constructor that can set all the fields once an object is created
toString(), eat(string food), sleeping(), drink(string drink)
5 person object
 */