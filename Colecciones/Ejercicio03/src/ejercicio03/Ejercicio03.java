package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Student;
import service.StudentService;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        Boolean flag = false;
        
        do {
            System.out.println("Ingrese Nombre del alumno");
            String nameStudent = scanner.nextLine();
            List <Integer> gradesStudent = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota " + (i+1));
                Integer grade = scanner.nextInt();
                gradesStudent.add(grade);
            }
            students.add(new Student(nameStudent, gradesStudent));
            
            scanner.nextLine();
            char next = ' ' ;
            do {
                System.out.println("Desea ingresar otro estudiante ?   Si = s  No = n");
                next =  scanner.nextLine().toLowerCase().charAt(0);
            } while (next != 's' && next != 'n');
            if (next == 'n') flag = true;
            
            
        } while (!flag);
        System.out.println("-----------------------------------------------------------------------");
        students.forEach(s -> System.out.println("Estudiante: " + s.getName() + " Notas: " + s.getGrades().toString()) );
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingrese el nombre de un estudiante para conocer su promedio");
        String nameAverage = scanner.nextLine();
        Student sAverage = null;
        for (Student student : students) {
            if (nameAverage.equalsIgnoreCase(student.getName())) {
                sAverage = student;
                break; 
            }
        }

        if(sAverage == null){
            System.out.println("Estudiante no encontrado");
        }else{
            StudentService ss = new StudentService();
            Integer average = ss.finalGrade(sAverage);
            System.out.println("Promedio del estudiante " + sAverage.getName() + "  es: " +average);
        }

    }
    
}
