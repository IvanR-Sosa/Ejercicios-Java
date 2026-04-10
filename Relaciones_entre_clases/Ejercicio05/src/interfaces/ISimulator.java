package interfaces;

import java.util.List;
import model.Student;
import model.Vote;

public interface ISimulator {

    List<String> listNames (Integer numberOfStudents);
    List<String> listDNIs (Integer numberOfStudents);
    List<Student> generateStudents(List<String> listNames,List<String> listDnis,Integer numberOfStudents );
    void showStudents (List<Student> listStudents);
    List<Vote> listVotes (List<Student> listStudents);
    void showVotes (List<Vote> listStudentsVotes);
    List<Student> voteCount (List<Student> listStudents);
    void asignFacilitator (List<Student>listStudents);
    
}
