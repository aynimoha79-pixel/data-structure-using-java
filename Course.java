package homework4;

import java.util.Arrays;

public class Course {

    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[4];
        numberOfStudents = 0;
    }

    // Get course name
    public String getCourseName() {
        return courseName;
    }

    // Add student
    public void addStudent(String student) {

        // If array is full, create a bigger array
        if (numberOfStudents >= students.length) {

            String[] newStudents =
                    new String[students.length * 2];

            System.arraycopy(
                    students,
                    0,
                    newStudents,
                    0,
                    students.length
            );

            students = newStudents;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop student
    public void dropStudent(String student) {

        for (int i = 0; i < numberOfStudents; i++) {

            if (students[i].equals(student)) {

                // Move remaining students one position left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;

                break;
            }
        }
    }

    // Get students
    public String[] getStudents() {
        return Arrays.copyOf(students, numberOfStudents);
    }

    // Get number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
   class TestCourse {
    public static void main(String[] args) {

        Course course = new Course("Java Programming");

        course.addStudent("cayuuni");
        course.addStudent("canab");
        course.addStudent("Aisha");
        course.addStudent("deeqo");
        course.addStudent("rumin");

        System.out.println("Course: "
                + course.getCourseName());

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());

        System.out.println("Students:");

        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        // Drop one student
        course.dropStudent("canab");

        System.out.println("\nAfter dropping canab:");

        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());
    }
}
