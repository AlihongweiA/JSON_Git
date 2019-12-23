package com.qf;

public class Student {

    private String name;
    private String age;
    private Scone score;
    private String gender;

    public Student() {
    }


    public Student(String name, String age, Scone scone, String gender) {
        this.name = name;
        this.age = age;
        this.score = scone;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", score=" + score +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Scone getScore() {
        return score;
    }

    public void setScore(Scone score) {
        this.score = score;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
