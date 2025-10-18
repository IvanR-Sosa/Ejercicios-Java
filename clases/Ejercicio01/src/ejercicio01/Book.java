package ejercicio01;

import java.util.Scanner;

public class Book {
          /*Crear una clase llamada Book que contenga los siguientes atributos: ISBN, Título, 
Autor, Número de páginas, y un constructor con todos los atributos pasados por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los 
datos al usuario y luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el numero de páginas. 
        */
    
    private String ISBN;
    private String title;
    private String author;
    private Integer numberOfPages;

    public Book() {
    }
    
    public Book(String ISBN,String title, String author,Integer numberOfPages){
       this.ISBN = ISBN;
       this.title = title;
       this.author = author;
       this.numberOfPages = numberOfPages;
    }
    
    public void uploadBook (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese ISBN");
        this.ISBN = scanner.nextLine();
        System.out.println("Ingrese titulo");
        this.title = scanner.nextLine();
        System.out.println("Ingrese nombre del autor");
        this.author = scanner.nextLine();
        System.out.println("Ingrese numero de paginas");
        this.numberOfPages = scanner.nextInt();
    }
    
    public void showBook (){
        System.out.println("ISBN :   " +this.ISBN );
        System.out.println("Titulo :   " + this.title);
        System.out.println("Autor :   " + this.author);
        System.out.println("Paginas :   " + this.numberOfPages );
    }
}
