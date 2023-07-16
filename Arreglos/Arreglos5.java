import java.util.Scanner;
import java.util.Arrays;
public class Arreglos5 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String[] palabras=new String[6];

        for (int i=0; i<palabras.length; i ++){
            System.out.println("Ingrese una palabra:");
            palabras[i]=reader.nextLine();
            System.out.println("la palabra es:" + palabras[i] + "\n");
        }
        System.out.println("Ingrese el numero de su palabra favorita:");
        int chosen=reader.nextInt();
        System.out.println(palabras[chosen-1]);
    }
}
