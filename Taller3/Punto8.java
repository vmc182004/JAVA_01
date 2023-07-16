package Taller3;
import java.util.Scanner;

public class Punto8{
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    // el Usuario Ingresa su nombre
    System.out.println("ingrese su Nombre");
    String nom = reader.nextLine();
    //Se imprime el nombre con la primera letra en mayuscula
    System.out.println(toLower(nom));
  }
  public static String toLower(String string){
    //Metodo para convertir la primera letra en mayuscula
    if (string == "") return "";
    return  string.toUpperCase().charAt(0) + string.substring(1, string.length()).toLowerCase();
  }

}