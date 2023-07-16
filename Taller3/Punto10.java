package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Punto10 {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String num1,num2;
        int numero1,numero2, suma, resta, multiplicacion,division;

        num1=JOptionPane.showInputDialog(null,"INGRESE EL PRIMER NÚMERO");
        numero1=Integer.parseInt(num1);
        num2=JOptionPane.showInputDialog(null,"INGRESE EL SEGUNDO NÚMERO");
        numero2=Integer.parseInt(num2);

        suma= numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;

        JOptionPane.showMessageDialog(null,"SUMA:"+ suma + "\n" + "RESTA:"+ resta + "\n" + "MULTIPLICACION:" + multiplicacion + "\n" + "DIVISION:" + division);
        
    }
}