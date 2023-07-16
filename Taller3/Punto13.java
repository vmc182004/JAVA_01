package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto13{
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    // el Usuario Ingresa su nombre
    System.out.println("ingrese su Nombre");
    String nom = reader.nextLine();
    System.out.println("ingrese su apellido");
    String ape = reader.nextLine();
    System.out.println("ingrese su segundo apellido");
    String ape2 = reader.nextLine();
    
    //se almacenan en el array
    String[] copyArr = {nom, ape, ape2};
    String[] newArr = toLowerArray(copyArr);
    System.out.println(newArr[0]);
    System.out.println(newArr[1]);
    System.out.println(newArr[2]);
  }

  public static String[] toLowerArray(String[] array){
    //Se combierte la primera letra en mayuscula
    String[] newArray = new String[array.length]; 
    for (int i = 0; i < array.length; i++){
      String string = array[i].toUpperCase().charAt(0) + array[i].substring(1, array[i].length()).toLowerCase();      
      newArray[i] = string;
    }
    return newArray;
  }
  

}
