package service;

import Interfaces.IStudent;
import model.Student;

public class StudentService implements IStudent {

    @Override
    public Integer finalGrade(Student student) {
        Integer average = 0;
        
        Integer n = student.getGrades().size();
        Integer x = 0;
        for (int i = 0; i < n; i++) {
            x += student.getGrades().get(i);
        }
        average = x / n;
        return average;
    }
    

    
}
