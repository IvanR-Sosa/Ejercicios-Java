package model;
/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ 
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas 
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán 
además definir los métodos getters y setters correspondientes. 
*/
public class Song {

    private String title;
    private String author;
    
    public Song () {
    this.title = "";
    this.author = "";
}

    public Song(String title, String author) {
        this.title = title;
        this.author = author;
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
    
    
    
}
