package extra02;

public class Extra02 {

    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
variable auxiliar. 
        */
        Integer a = 8;
        Integer b = 4;
        Integer c = 6;
        Integer d = 2;
        Integer aux = b;
        System.out.println("a:" +  a + " b:" + b +" c:" + c + " d:" + d );
        System.out.println("----------------------------------");
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("a:" +  a + " b:" + b +" c:" + c + " d:" + d );
        

    }
  
    
}
