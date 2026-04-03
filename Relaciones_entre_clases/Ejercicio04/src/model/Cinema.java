package model;

public class Cinema {
    
    private Movie movie;
    private Screen screen;
    private Double price;

    public Cinema() {
    }

    public Cinema(Movie movie, Screen screen, Double price) {
        this.movie = movie;
        this.screen = screen;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    
}
