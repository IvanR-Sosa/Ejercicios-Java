package ejercicio05;

import Service.SimulatorService;
import java.util.List;
import model.Student;
import model.Vote;

public class Ejercicio05 {

    public static void main(String[] args) {

        SimulatorService simulatorService = new SimulatorService();
        Integer numberOfStudents = 15;
        
        List<String> names = simulatorService.listNames(numberOfStudents);
        List<String> dniList= simulatorService.listDNIs(numberOfStudents);
        List<Student> students = simulatorService.generateStudents(names, dniList, numberOfStudents);
        
        System.out.println("-------------------------------------------------------");
        simulatorService.showStudents(students);
        List<Vote> votes = simulatorService.listVotes(students);
        System.out.println("---------------------------------------------------------");
        simulatorService.showVotes(votes);
        List<Student> votesCounts = simulatorService.voteCount(students);
        System.out.println("----------------------------------------------------------");
        simulatorService.showStudents(students);
        simulatorService.asignFacilitator(students);
        

    }
    
}
