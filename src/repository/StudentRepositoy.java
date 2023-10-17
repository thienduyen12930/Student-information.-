
package repository;

import dataAcess.StudentDAO;
import model.Student;
import java.util.ArrayList;

public class StudentRepositoy implements IStudentRepository{

    @Override
    public void display(ArrayList<Student> lt) {
        StudentDAO.Instance().display(lt);
    }
    
}