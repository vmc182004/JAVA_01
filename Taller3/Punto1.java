package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String cadena;
        int nota;
        //PEDIR LA NOTA AL NOTA AL USUARIO CON SOLO ENTEROS
        cadena=JOptionPane.showInputDialog("INGRESE SU NOTA DEFINITIVA-0 AL 5");
        nota=Integer.parseInt(cadena);
        //EVALUAR EL PROCEDIMIENTO PARA DAR UNA CALIFICACION
        if (nota == 0) {
             JOptionPane.showMessageDialog(null,"SU NOTA ES DEFICIENTE");
         }
         else if(nota==1){
            JOptionPane.showMessageDialog(null,"SU NOTA ES INSUFICIENTE");
         }
         else if(nota==2){
            JOptionPane.showMessageDialog(null,"SU NOTA ES ACEPTABLE");
         }
         else if(nota==3){
            JOptionPane.showMessageDialog(null,"SU NOTA ES BUENA");
         }
         else if(nota==4){
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
    

