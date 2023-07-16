package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String cadena;
        float nota;
        //PEDIR LA NOTA AL NOTA AL USUARIO CON DECIMALES
        cadena=JOptionPane.showInputDialog("INGRESE SU NOTA DEFINITIVA-0 AL 5");
        nota= Float.valueOf(cadena);
        //EVALUAR EL PROCEDIMIENTO PARA DAR UNA CALIFICACION
        if (nota>=0 && nota <1) {
             JOptionPane.showMessageDialog(null,"SU NOTA ES DEFICIENTE");
         }
         else if(nota>=1 && nota<2){
            JOptionPane.showMessageDialog(null,"SU NOTA ES INSUFICIENTE");
         }
         else if(nota>=2 && nota<3){
            JOptionPane.showMessageDialog(null,"SU NOTA ES ACEPTABLE");
         }
         else if(nota>=3 && nota<4){
            JOptionPane.showMessageDialog(null,"SU NOTA ES BUENA");
         }
         else if(nota>=4 && nota<5){
            JOptionPane.showMessageDialog(null,"SU NOTA ES SOBRESALIENTE");
         }
         else if(nota==5){
            JOptionPane.showMessageDialog(null,"SU NOTA ES EXCELENTE");
         }
         else {
            JOptionPane.showMessageDialog(null,"INGRESE UNA NOTA VALIDA");
         }
        }
    }

