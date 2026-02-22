package model;

public class Movie {
    
    private String tittle;
    private String director;
    private Double duration;

    public Movie() {
    }

    public Movie(String tittle, String director, Double duration) {
        this.tittle = tittle;
        this.director = director;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Título: " + tittle + " | Director: " + director + " | Duración: " + duration + "h";
    }
    
    
    
    
    
}
