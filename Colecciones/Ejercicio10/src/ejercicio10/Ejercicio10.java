package ejercicio10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashMap <Integer,String> citiesMap = new HashMap<>();
        
        citiesMap.put(1, "Bogota");
        citiesMap.put(2, "Medellin");
        citiesMap.put(3, "Pekin");
        citiesMap.put(4, "Tokyo");
        citiesMap.put(5, "Shenzen");
        citiesMap.put(6, "Oslo");
        citiesMap.put(7, "Bergen");
        citiesMap.put(8, "Madrid");
        citiesMap.put(9, "Amsterdam");
        citiesMap.put(10, "Barcelona");
        System.out.println("---------------Visualizar datos-----------");
        
        for (Map.Entry<Integer, String> entry : citiesMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " Ciudad: " + entry.getValue());
        }
        
       /* for (int i = 0; i < 5; i++) {// se hace hasta 5 porque asi lo pide el ejercicio pero puedes crear un menu y hacer que sea a voluntad
               System.out.println("Ingrese el Id de la ciudad deseada (Recuerde que si ya existe el dato ingresado reemplazara al existente) "); 
               Integer id = Integer.parseInt(scanner.nextLine());
               System.out.println("Ingrese el nombre de la ciudad");
               String cityName = scanner.nextLine();
               
               citiesMap.put(id, cityName);
            
        }
         System.out.println("---------------Visualizar datos-----------");
         for (Integer K : citiesMap.keySet()){
               System.out.println("ID: " + K + " Ciudad: " + citiesMap.get(K)); 
         }*/
         System.out.println("---------------Buscar Ciudad Por Id-----------------");
         System.out.println("Ingrese un id para buscar Ciudad");
         Integer findId = Integer.parseInt(scanner.nextLine());
         Boolean flag = false;
         for (Integer K : citiesMap.keySet()){
             if (K == findId){
               System.out.println("ID: " + K + " Ciudad: " + citiesMap.get(K)); 
               flag = true;
             }
         }
             if (flag == false) System.out.println("Id no encontrado");
         
         System.out.println("---------------Eliminar Ciudad-----------------");
         System.out.println("Ingrese un Id Para eliminarlo de la lista");
         Integer idDelete = Integer.parseInt(scanner.nextLine());
         if (citiesMap.containsKey(idDelete)) {
             citiesMap.remove(idDelete);
             System.out.println("ID: " + idDelete + " Eliminado exitosamente");
         }else{
             System.out.println("ID: " + idDelete + " No encontrado");
         }
         for (Integer K : citiesMap.keySet()){
               System.out.println("ID: " + K + " Ciudad: " + citiesMap.get(K)); 
         }
         
    }
    
}
