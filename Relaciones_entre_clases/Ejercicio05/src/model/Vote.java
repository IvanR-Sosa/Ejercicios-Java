package model;

import java.util.List;

public class Vote {
    
    private Student studentWhoVotes;
    private List<Student> studentsVoted;

    public Vote() {
    }

    public Vote(Student studentWhoVotes, List<Student> studentsVoted) {
        this.studentWhoVotes = studentWhoVotes;
        this.studentsVoted = studentsVoted;
    }

    public Student getStudentWhoVotes() {
        return studentWhoVotes;
    }

    public void setStudentWhoVotes(Student studentWhoVotes) {
        this.studentWhoVotes = studentWhoVotes;
    }

    public List<Student> getStudentsVoted() {
        return studentsVoted;
    }

    public void setStudentsVoted(List<Student> studentsVoted) {
        this.studentsVoted = studentsVoted;
    }

    @Override
    public String toString() {
        String listNames = "";
        for (Student student : studentsVoted) {
            listNames += student.getName() +"\n";
        }
        String show = this.studentWhoVotes.getName() + "  Eligio votar por : \n";
        
                
        return show + listNames + "\n\n";
    }
    
    
    
    
}
