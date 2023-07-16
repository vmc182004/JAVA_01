import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[]args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad=reader.nextInt();
        if (edad>=18){
            System.out.print("Acceso concedido al bar");
        } else {
            System.out.print("Acceso denegado, no puede entrar");
        }
    }
}
