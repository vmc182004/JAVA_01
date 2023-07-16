package Taller3;
import java.util.Scanner;

public class Punto12{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
  
      int i = 0;
      System.out.println("Ingresar cantidad de estudiantes:");
      int students = scanner.nextInt();
      String[][] data = new String[students + 1][5];
      while (i < students){
        System.out.println("\nIngresar nombre estudiante: " + i);
        data[i][0] = scanner.next();
  
        System.out.println("\nIngresar CC");
        int cc = scanner.nextInt();
        data[i][1] = Integer.toString(cc);
  
        System.out.println("\nIngresar edad");
        int edad = scanner.nextInt();
        data[i][2] = Integer.toString(edad);
  
        System.out.println("\nIngresar programa de formacion");
        data[i][3] = scanner.next();
        i++;
      }
      System.out.println("\n\n\n Datos recolectados:\n");
      for (String[] s : data){
        if (s[0] == null) break;
        System.out.println("Nombre: " + s[0] + "\n");
        System.out.println("CC: " + s[1] + "\n");
        System.out.println("Edad: " + s[2] + "\n");
        System.out.println("Programa de formacion: " + s[3] + "\n");
        System.out.println("\n...\n");
      }
    }
  }