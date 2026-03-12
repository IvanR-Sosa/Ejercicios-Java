package ejercicio08;

import java.util.ArrayList;
import java.util.Scanner;
import model.FamousSinger;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        ArrayList <FamousSinger> listSingers = new ArrayList<>();
        listSingers.add(new FamousSinger("Pepo","pepitas"));
        listSingers.add(new FamousSinger("Rosa","Rositas"));
        listSingers.add(new FamousSinger("Tato","Tatarara"));
        listSingers.add(new FamousSinger("Renk","blup"));
        listSingers.add(new FamousSinger("Mario","Marias"));
        
        listSingers.forEach(System.out::println);
        
        Boolean flag = false;
        
        do {
            System.out.println("--------------------------");
            System.out.println("------Menu-------");
            System.out.println("------1 -> Agregar Artista -------");
            System.out.println("------2 -> Mostrar todos los Artistas-------");
            System.out.println("------3 -> Quitar de la lista-------");
            System.out.println("------4 -> salir del menu-------");
            System.out.println("----------------------------");
            Integer option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Ingrese Nombre del artista");
                    String artistName = scanner.nextLine();
                    System.out.println("Ingrese el nombre del disco mas Vendido de el Artista");
                    String record = scanner.nextLine();
                    listSingers.add(new FamousSinger(artistName,record));
                    break;
                case 2:
                    listSingers.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del artista para quitarlo de la lista");
                    String artistNameDelete = scanner.nextLine();
                    for (FamousSinger listSinger : listSingers) {
                        if (listSinger.getName().equalsIgnoreCase(artistNameDelete)) {
                            listSingers.remove(listSinger);
                            System.out.println("Eliminacion exitosa");
                            break;
                        }
                        
                    }
                    
                    break;
                case 4:
                    flag = true;
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        } while (!flag);
        System.out.println("-------------------------------------------------------");
        
         listSingers.forEach(System.out::println);

    }
    
}
