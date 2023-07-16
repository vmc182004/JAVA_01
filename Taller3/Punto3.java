package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String cadena;
        int op;
        //GENERAR NÚMERO RANDOM
        int randomNum=(int)(Math.random()*2);
        Integer.valueOf(randomNum);
        //JOptionPane.showMessageDialog(null,randomNum);
        
        //USUARIO ELIJE UNA OPCION
        cadena=JOptionPane.showInputDialog(null,"ELIJA UNA NÚMERO PARA LA OPCIÓN:\n"+"0=PIEDRA\n"+"1=PAPEL\n"+"2=TIJERA\n"); 
        op=Integer.parseInt(cadena);

        if (op==0 && randomNum==0){
            JOptionPane.showMessageDialog(null,"TU TIENES PIEDRA\nYO TAMBIÉN\nEMPATE");
        }
        else if(op==0 && randomNum==1){
            JOptionPane.showMessageDialog(null,"TU TIENES PIEDRA\nYO PAPEL\nPERDISTE");
        }
        else if(op==0 && randomNum==2){
            JOptionPane.showMessageDialog(null,"TU TIENES PIEDRA\nYO TIJERA\nGANASTE");
        }
        else if(op==1 && randomNum==0){
            JOptionPane.showMessageDialog(null,"TU TIENES PAPEL\nYO PIEDRA\nGANASTE");
        }
        else if(op==1 && randomNum==1){
            JOptionPane.showMessageDialog(null,"TU TIENES PAPEL\nYO PAPEL\nEMPATE");
        }
        else if(op==1 && randomNum==2){
            JOptionPane.showMessageDialog(null,"TU TIENES PAPEL\nYO TIJERA\nPERDISTE");
        }
        else if(op==2 && randomNum==0){
            JOptionPane.showMessageDialog(null,"TU TIENES TIJERA\nYO PIEDRA\nPERDISTE");
        }
        else if(op==2 && randomNum==1){
            JOptionPane.showMessageDialog(null,"TU TIENES TIJERA\nYO PAPEL\nGANASTE");
        }
        else if(op==2 && randomNum==2){
            JOptionPane.showMessageDialog(null,"TU TIENES TIJERA\nYO TIJERA\nEMPATE");
        }

        

}
}
