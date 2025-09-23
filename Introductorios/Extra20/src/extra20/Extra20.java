package extra20;

import java.util.ArrayList;
import java.util.Random;

public class Extra20 {

    public static void main(String[] args) {
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de 
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4 
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de 
cada nota son: 
Primer trabajo práctico evaluativo 10% 
Segundo trabajo práctico evaluativo 15% 
Primer Integrador 25% 
Segundo integrador 50% 
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final 
del programa los profesores necesitan obtener por pantalla la cantidad de 
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con	promedio mayor o igual al 7 de sus notas del curso. 
        */
        Double[][] note = new Double [10][4];
        Double[] average = new Double[10];

        Random random = new Random();
        
        fillNotes(note, random);
        averageStudents(note, average);
    }
    
    public static Boolean studentAprobed (Double averageStudent){
        if (averageStudent >= 7.0) return true;
        return false;
    }
    public static void averageStudents (Double[][] note,Double[] average){
       for (int i = 0; i < note.length; i++) {
           Double[] percentageOfGrades = {0.10, 0.15, 0.25, 0.50};
           Double aux = 0.0;
            for (int j = 0; j < note[i].length; j++) {
                aux += (note[i][j]*percentageOfGrades[j]);
            }
            average[i] = aux;
            System.out.println("Promedio del Alumno " + i + " es:  " + average[i]);
            System.out.println("Aprobacion del estudiante :  " + studentAprobed(average[i]) );
        }
       Integer aprobed = 0;
        for (int i = 0; i < average.length; i++) {
            if ( studentAprobed(average[i])) aprobed ++;
        }
        System.out.println("Han aprobado  " + aprobed + "  estudiantes");
    }
    public static void fillNotes (Double[][] note,Random random){
        for (int i = 0; i < note.length; i++) {
            for (int j = 0; j < note[i].length; j++) {
                note[i][j] = random.nextDouble(10.0);
                
            }
            
        }
    }
    
}
