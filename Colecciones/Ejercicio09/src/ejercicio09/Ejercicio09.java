package ejercicio09;

import java.util.HashSet;
import java.util.Scanner;
import model.Library;
import service.LibraryService;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet <Library> booksLibrary = new HashSet<>();
        LibraryService libraryService = new LibraryService();
        Boolean flag = false;
        do {
            System.out.println("Ingrese Titulo del libro");
            String title = scanner.nextLine();
            System.out.println("Ingrese nombre del autor");
            String author = scanner.nextLine();
            System.out.println("Ingrese la cantidad de copias en inventario");
            Integer copies = Integer.parseInt(scanner.nextLine());// Asumiremos que se ingresan un numero positivo 
            
            booksLibrary.add(new Library(title,author,copies));
            System.out.println("Desea añadir otro libro a la lista?  1 -> si   2 -> no (cualquier otro numero sera tenido en cuenta como un NO");
            Integer option = Integer.parseInt(scanner.nextLine());
            if (option != 1 ) flag = true;

        } while (!flag);
        System.out.println("-----------------------Visualizcion de libros-------------------------");
        booksLibrary.forEach(System.out::println);
        System.out.println("-----------------------Prestamo-------------------------");
        libraryService.lending(booksLibrary);
        booksLibrary.forEach(System.out::println);
        System.out.println("-----------------------Devolucion-------------------------");
        libraryService.bookReturn(booksLibrary);
        booksLibrary.forEach(System.out::println);
    }
    
}
