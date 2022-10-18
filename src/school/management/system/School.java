package school.management.system;

import java.util.List;

/**
 * Many teachers, Many Students
 * Implements teachers and student using an ArrayList
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school objec is created
     * @param teachers list of teachers in the school.
     * @param students list of student in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeacher() { // returns the list of teachers in the school
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return students;
    }
    /**
     * Adds a student to the school.
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Updates the total money earned by the school
     * @param MoneyEarned money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * updates the total money spent by the school which
     * is the salary given by the school to the teachers.
     * @param MoneySpent money that is supposed to be spent
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }

}
