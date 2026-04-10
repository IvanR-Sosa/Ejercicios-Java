package Service;

import interfaces.ISimulator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import model.Facilitator;
import model.Student;
import model.Vote;

public class SimulatorService implements ISimulator{

    @Override
    public List<String> listNames(Integer numberOfStudents) {
        
        // --- NOMBRES ---
List<String> firstNames = new ArrayList<>(Arrays.asList(
                "Santiago", "Valentina", "Mateo", "Lucía", "Nicolás",
                "Camila", "Tomás", "Martina", "Agustín", "Sofía",
                "Facundo", "Florencia", "Ignacio", "Julieta", "Ezequiel",
                "Antonella", "Leandro", "Micaela", "Rodrigo", "Natalia"));
        //APELLIDOS
        List<String> lastNames = new ArrayList<>(Arrays.asList(
                "González", "Rodríguez", "Fernández", "López", "Martínez",
                "García", "Pérez", "Sánchez", "Romero", "Torres",
                "Díaz", "Álvarez", "Ruiz", "Moreno", "Jiménez",
                "Herrera", "Medina", "Castro", "Suárez", "Vargas"
        ));
        
        List<String> names =  new ArrayList<>();
        Random random = new Random();
        
         for (int i = 0; i < numberOfStudents; i++) {
            String name = firstNames.get(random.nextInt(firstNames.size()));
            String lastName = lastNames.get(random.nextInt(lastNames.size()));
            
            names.add(name + " " + lastName);
        }
         
         return names;
        
    }

    @Override
    public List<String> listDNIs(Integer numberOfStudents) {
        Integer min = 10_000_000;
        Integer max = 50_000_000;
        Random random = new Random();
        
        Set<String> dniList =new HashSet<>();
        
        while (dniList.size() < numberOfStudents) {
            Integer x = (random.nextInt(max - min +1) +min);
            String dni = String.valueOf(x);
            dniList.add(dni);
        }
        return new ArrayList<>(dniList);
    }

    @Override
    public List<Student> generateStudents(List<String> listNames, List<String> listDnis, Integer numberOfStudents) {
        List<Student> listStudents= new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            listStudents.add( new Student (listNames.get(i), listDnis.get(i)));
        }
        
        return  listStudents;
    }

    @Override
    public void showStudents(List<Student> listStudents) {
        listStudents.forEach(System.out::println);
    }

    @Override
    public List<Vote> listVotes(List<Student> listStudents) {
        List<Vote> listStudentVotes = new ArrayList<>();
        
        Random random = new Random();
        
        for (Student student : listStudents) {
            Set<Student> votesStudent = new HashSet<>();
            while (votesStudent.size()<3) {
                Integer x = random.nextInt(listStudents.size());
                Student vStudent = listStudents.get(x);
                
                if (!student.equals(vStudent)) {
                    votesStudent.add(vStudent);
                     vStudent.setVotes(vStudent.getVotes() + 1);
                }
            }
      listStudentVotes.add(new Vote(student,new ArrayList<>(votesStudent)));
            
        }
        System.out.println("OKK------------------------------------------------------------");
        return listStudentVotes;
    }

    @Override
    public void showVotes(List<Vote> listStudentsVotes) {
        listStudentsVotes.forEach(System.out::println);
    }

    @Override
    public List<Student> voteCount(List<Student> listStudents) {
        listStudents.sort(Comparator.comparing(Student::getVotes).reversed());
        return listStudents;
    }

    @Override
    public void asignFacilitator(List<Student> listStudents) {
        List<Facilitator> holders = new ArrayList<>();
        List<Facilitator> substitutes = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            Student student = listStudents.get(i);
            if (i < 5) {
              holders.add(new Facilitator(student, false));
            }else{
                substitutes.add(new Facilitator(student,true));
            }
        }
        System.out.println("Facilitadores Titulares");
        holders.forEach(System.out::println);
        System.out.println("Facilitadores Suplentes");
        substitutes.forEach(System.out::println);
        
        
        System.out.println("OKK---------------------------------------------------------------");
    }
    
    
    

    
    
}
