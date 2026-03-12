package service;

import interfaces.ILibrary;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import model.Library;

public class LibraryService implements ILibrary{
    Scanner scanner = new Scanner(System.in);

    @Override
    public Boolean lending(HashSet<Library> listBooks) {
        System.out.println("Ingrese el titulo del libro que desea pedir");
        String title = scanner.nextLine();
        Iterator <Library> iter = listBooks.iterator();
        while (iter.hasNext()) {
            Library book = iter.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                 if (book.getNumberOfCopies() > book.getNumberOfCopiesBorrowed()) {
                iter.remove();
                book.setNumberOfCopiesBorrowed(book.getNumberOfCopiesBorrowed() + 1);
                listBooks.add(book);
                return true;
            } else {
                System.out.println("No hay copias disponibles de este libro");
                return false;
            }
            }
        }
        System.out.println("Operacion no  es posible");
        return false;
    }

    @Override
    public Boolean bookReturn(HashSet<Library> listBooks) {
        System.out.println("Ingrese el titulo del libro que desea devolver");
        String title = scanner.nextLine();
        Iterator <Library> iter = listBooks.iterator();
        while (iter.hasNext()) {
            Library book = iter.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                 if (book.getNumberOfCopiesBorrowed() > 0) {
                iter.remove();
                book.setNumberOfCopiesBorrowed(book.getNumberOfCopiesBorrowed() -1);
                listBooks.add(book);
                return true;
            } else {
                System.out.println("No hay copias Prestadas de este libro");
                return false;
            }
            }
        }
        System.out.println("Operacion no  es posible");
        return false;
    }

    
}
