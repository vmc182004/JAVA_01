package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto5 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        float num;
        JOptionPane.showInputDialog(null,"INGRESE UN NÚMERO"); 
        num=Integer.parseInt(null);
        JOptionPane.showMessageDialog(null,"LOS MÚLTIPLOS DE "+num+" ENTRE 100 Y 500 SON: ");
        for(int i = 100; i <= 500; i++ ){
            if (i%num==0)
                JOptionPane.showMessageDialog(null,i);
                break;
        }
    }
}
