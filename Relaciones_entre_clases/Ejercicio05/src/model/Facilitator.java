package model;

public class Facilitator {
    
    private  Student studentF;
    private Boolean isASubstitute;

    public Facilitator() {
    }

    public Facilitator(Student studentF, Boolean isASubstitute) {
        this.studentF = studentF;
        this.isASubstitute = isASubstitute;
    }

    public Student getStudentF() {
        return studentF;
    }

    public void setStudentF(Student studentF) {
        this.studentF = studentF;
    }

    public Boolean getIsASubstitute() {
        return isASubstitute;
    }

    public void setIsASubstitute(Boolean isASubstitute) {
        this.isASubstitute = isASubstitute;
    }

    @Override
    public String toString() {
        String show = "";
        if (this.isASubstitute == true){
            show = this.studentF.getName() + "  es Facilitador Titular";
        }else{
            show = this.studentF.getName() + "  es Facilitador Titular";
        }
        return show;
    }
    
    
    
}
