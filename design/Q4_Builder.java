package com.bootcamp.design_patterns;


class Student{

    private int rollno;
    private String name;
    private String course;
    private boolean optBusFacility;
    private double grades;
    private String city;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isOptBusFacility() {
        return optBusFacility;
    }

    public void setOptBusFacility(boolean optBusFacility) {
        this.optBusFacility = optBusFacility;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(StudentBuilder studentBuilder) {
        this.rollno = studentBuilder.getRollno();
        this.name = studentBuilder.getName();
        this.course = studentBuilder.getCourse();
        this.optBusFacility = studentBuilder.isOptBusFacility();
        this.grades = studentBuilder.getGrades();
        this.city = studentBuilder.getCity();
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", optBusFacility=" + optBusFacility +
                ", grades=" + grades +
                ", city='" + city + '\'' +
                '}';
    }
}
class StudentBuilder
{
    private int rollno;
    private String name;
    private String course;
    private boolean optBusFacility;
    private double grades;
    private String city;

    public StudentBuilder(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public StudentBuilder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public StudentBuilder withCourse(String course) {
        this.course = course;
        return this;
    }

    public boolean isOptBusFacility() {
        return optBusFacility;
    }

    public StudentBuilder hasOptBusFacility(boolean optBusFacility) {
        this.optBusFacility = optBusFacility;
        return this;
    }

    public double getGrades() {
        return grades;
    }

    public StudentBuilder withGrades(double grades) {
        this.grades = grades;
        return this;
    }

    public String getCity() {
        return city;
    }

    public StudentBuilder ofCity(String city) {
        this.city = city;
        return this;
    }
    public Student build()
    {
        return new Student(this);
    }

}

public class Q4_Builder {

    public static void main(String[] args) {
        Student student1=new StudentBuilder(10,"Hema")
                .withCourse("MCA")
                .hasOptBusFacility(true)
                .withGrades(8.7)
                .ofCity("Bangalore")
                .build();
        System.out.println(student1);
    }
}
