
package boletin2_4;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2;
        Scanner sc=new Scanner (System.in);
        System.out.println(" agregar número : ");
        num1=sc.nextFloat();
        System.out.println(" agregar número : ");
        num2=sc.nextFloat();
        System.out.println("suma = "+ (num1+num2) +" resta = "+ (num1-num2) +" producto = "+ (num1*num2) +" cociente = "+ (num1/num2));
    }                                   //CUIDADO CON LOS PARENTESIS. SI NO LOS PUSIERA NO DABA BIEN LA CUENTA.
    
}
