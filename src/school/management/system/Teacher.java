package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * this class is responsible for keeping the track of teacher's name
 * , id , salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creae a new teacher object.
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() { //return the id of the teacher
        return id;
    }

    public String getName() { //return the name of the teacher
        return name;
    }

    public int getSalary() { //return the salary of the teacher
        return salary;
    }

    public void setSalary(int salary) { //set the salary
        this.salary = salary;
    }
    /**
     * Adds to salary
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneyEarned(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                 + " Total salary earned so far $"
                + salaryEarned;
    }
}
