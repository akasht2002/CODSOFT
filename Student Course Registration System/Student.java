package CodeSoft;

import java.util.*;
class Student {
    private int id;
    private String name;
    private ArrayList<Course> registeredCourses;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Method to register for a course
    public void registerForCourse(Course course) {
        registeredCourses.add(course);
        course.registerStudent();
    }

    // Method to drop a course
    public void dropCourse(Course course) {
        if (registeredCourses.contains(course)) {
            registeredCourses.remove(course);
            course.removeStudent();
        } else {
            System.out.println("You are not registered for this course.");
        }
    }

    // Method to display registered courses
    public void displayRegisteredCourses() {
        System.out.println("Registered Courses for Student: " + id + " - " + name);
        for (Course course : registeredCourses) {
            System.out.println(course.getCode() + " - " + course.getTitle());
        }
    }
}
