package CodeSoft;

public class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private String schedule;

    // Constructor
    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    // Method to check if there are available slots in the course
    public boolean hasAvailableSlots() {
        return capacity > 0;
    }

    // Method to register a student for the course
    public void registerStudent() {
        if (capacity > 0) {
            capacity--;
            System.out.println("Registration successful for course: " + code);
        } else {
            System.out.println("Sorry, the course is already full.");
        }
    }

    // Method to remove a student from the course
    public void removeStudent() {
        capacity++;
        System.out.println("Student removed from course: " + code);
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Capacity: " + capacity);
        System.out.println("Schedule: " + schedule);
    }
}
