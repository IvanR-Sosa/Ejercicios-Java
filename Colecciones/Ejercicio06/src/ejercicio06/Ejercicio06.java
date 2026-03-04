package ejercicio06;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String,Double> products = new HashMap<>();
        Boolean flag = false;
        do {            
            System.out.println("----Menu-----");
            System.out.println("----1 = Agregar producto-----");
            System.out.println("----2 = Modificar Precio-----");
            System.out.println("----3 = Remover Producto-----");
            System.out.println("----4 = Listar productos-----");
            System.out.println("----5 = salir-----");
            Integer option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    addproduct(products, scanner);
                    break;
                case 2:
                    changePrice(products, scanner);
                    break;
                case 3:
                    deleteProduct(products, scanner);
                    break;
                case 4:
                    showProducts(products);
                    break;
                    case 5:
                        flag = true;
                        break;
                    
                default:
                    System.out.println("Opcion no valida");
            }

        } while (!flag);
        

    }
    
    public static void addproduct (HashMap products,Scanner scanner){
        System.out.println("Ingrese el nombre del producto");
        String nameProduct =  scanner.nextLine();
        System.out.println("Ingrese el valor del producto");
        Double valueProduct =  Double.parseDouble(scanner.nextLine());
        products.put(nameProduct,valueProduct);
    }
    public static void changePrice(HashMap products,Scanner scanner){
        System.out.println("Ingrese el nombre del producto que desea cambiar de precio");
        String nameProduct = scanner.nextLine();
        if (products.containsKey(nameProduct)) {
            System.out.println("Ingrese el nuevo valor del producto");
            Double newValue = Double.parseDouble(scanner.nextLine());
            products.replace(nameProduct, newValue);
        }else{
            System.out.println("Producto no encontrado");
        }
    }
    public static void deleteProduct(HashMap products,Scanner scanner){
        System.out.println("Ingrese el nombre del producto que desea remover");
        String nameProduct = scanner.nextLine();
        if (products.containsKey(nameProduct)) {
            products.remove(nameProduct);
        }else{
            System.out.println("Producto no encontrado");
        }
    }
    public static void showProducts(HashMap products){
        products.forEach( (key,value) -> System.out.println("Producto " + key + " precio: $ " +value) );
    }
    
}
