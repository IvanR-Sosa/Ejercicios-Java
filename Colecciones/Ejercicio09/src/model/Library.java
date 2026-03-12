package model;

public class Library {
    private String title;
    private String author;
    private Integer numberOfCopies;
    private Integer numberOfCopiesBorrowed;
    
    public Library (){
        
    }
    public Library (String title,String author,Integer numberOfCopies){
        this.title = title;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
        this.numberOfCopiesBorrowed = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(Integer numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public Integer getNumberOfCopiesBorrowed() {
        return numberOfCopiesBorrowed;
    }

    public void setNumberOfCopiesBorrowed(Integer numberOfCopiesBorrowed) {
        this.numberOfCopiesBorrowed = numberOfCopiesBorrowed;
    }

    @Override
    public String toString() {
        return "Titulo : " + this.title + "\nAutor : " + this.author + "\nCopias en Inventario : " + this.numberOfCopies + "\nCopias prestadas : " + this.numberOfCopiesBorrowed + "\n\n"; 
    }
    
    
}
