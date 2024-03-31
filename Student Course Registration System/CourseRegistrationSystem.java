package CodeSoft;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("CS101", "Introduction to Programming", "Learn basic programming concepts", 30, "Mon-Wed-Fri 9:00-10:30");
        Course course2 = new Course("CS202", "Data Structures", "Explore advanced data structures", 25, "Tue-Thu 11:00-12:30");

        // Create students
        Student student1 = new Student(1001, "Alice");
        Student student2 = new Student(1002, "Bob");

        // Display course listings
        System.out.println("Available Courses:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Register students for courses
        student1.registerForCourse(course1);
        student2.registerForCourse(course1);
        student2.registerForCourse(course2);

        // Display registered courses for each student
        student1.displayRegisteredCourses();
        System.out.println();
        student2.displayRegisteredCourses();
        System.out.println();

        // Drop a course for student2
        student2.dropCourse(course1);
        student2.displayRegisteredCourses();
    }
}
