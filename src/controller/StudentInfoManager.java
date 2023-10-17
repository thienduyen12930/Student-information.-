
package controller;

import model.Student;
import repository.StudentRepositoy;
import java.util.ArrayList;

public class StudentInfoManager {
    StudentRepositoy program;
    ArrayList<Student> lt;

    public StudentInfoManager() {
        program = new StudentRepositoy();
        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\nCollection Sort Program");
        program.display(lt);
    }
}