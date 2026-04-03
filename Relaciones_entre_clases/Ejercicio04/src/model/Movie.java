package model;

public class Movie {

    private String tittle;
    private Double runtime;
    private Integer minimumAge;
    private String director;

    public Movie() {
    }

    public Movie(String tittle, Double runtime, Integer minimumAge, String director) {
        this.tittle = tittle;
        this.runtime = runtime;
        this.minimumAge = minimumAge;
        this.director = director;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Double getRuntime() {
        return runtime;
    }

    public void setRuntime(Double runtime) {
        this.runtime = runtime;
    }

    public Integer getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
}
