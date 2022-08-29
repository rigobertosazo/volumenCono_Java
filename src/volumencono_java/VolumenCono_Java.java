package volumencono_java;
import java.util.Scanner;

/**@author Rib*/
//Programa que calcula el volumen de un cono de geometría

public class VolumenCono_Java
{
    public static void main(String[] args) 
    {
        int radio, altura;
        float volumen;
        final float PI = 3.1416f;
  
        Scanner s = new Scanner(System.in);
            System.out.println("Ingrese el radio del cono: ");
            radio = s.nextInt();
            System.out.println("Ingrese la altura del cono: ");
            altura = s.nextInt();
            volumen = (PI*(radio*radio)*altura)/3; //formula del volumen de un cono
            System.out.println("El volumen del cono es: "+volumen);
    }
}