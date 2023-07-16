import java.util.Scanner;
import javax.swing.JOptionPane;


public class Calculadora3 {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String cadena,num1,num2;
        int op,numero1,numero2, resultado;

        do{
        cadena=JOptionPane.showInputDialog(null,"ELIJA UNA OPCIÓN DE LA CALCULADORA:\n"+"1.SUMA\n"+"2.RESTA\n"+"3.MULTIPLICACIÓN\n"+"4.DIVISIÓN\n"+"5.SALIR\n"); 
        op=Integer.parseInt(cadena);
            switch(op){
                case 1:
                num1=JOptionPane.showInputDialog(null,"INGRESE EL PRIMER NÚMERO");
                numero1=Integer.parseInt(num1);
                num2=JOptionPane.showInputDialog(null,"INGRESE EL SEGUNDO NÚMERO");
                numero2=Integer.parseInt(num2);
    
                if (op == 1) {
                   resultado= numero1+numero2;
                    JOptionPane.showMessageDialog(null,"EL RESULTADO ES: " + resultado);
                }
                break;
    
                case 2:
                num1=JOptionPane.showInputDialog(null,"INGRESE EL PRIMER NÚMERO");
                numero1=Integer.parseInt(num1);
                num2=JOptionPane.showInputDialog(null,"INGRESE EL SEGUNDO NÚMERO");
                numero2=Integer.parseInt(num2);
    
                if (op == 2) {
                   resultado= numero1-numero2;
                    JOptionPane.showMessageDialog(null,"EL RESULTADO ES: " + resultado);
                }
                break;
    
                case 3:
                num1=JOptionPane.showInputDialog(null,"INGRESE EL PRIMER NÚMERO");
                numero1=Integer.parseInt(num1);
                num2=JOptionPane.showInputDialog(null,"INGRESE EL SEGUNDO NÚMERO");
                numero2=Integer.parseInt(num2);
    
                if (op == 3) {
                   resultado= numero1*numero2;
                    JOptionPane.showMessageDialog(null,"EL RESULTADO ES: " + resultado);
                }
                break;
    
                case 4:
                num1=JOptionPane.showInputDialog(null,"INGRESE EL PRIMER NÚMERO");
                numero1=Integer.parseInt(num1);
                num2=JOptionPane.showInputDialog(null,"INGRESE EL SEGUNDO NÚMERO");
                numero2=Integer.parseInt(num2);
    
                if (op == 4) {
                   resultado= numero1/numero2;
                    JOptionPane.showMessageDialog(null,"EL RESULTADO ES: " + resultado);
                }
                break;
            }
            }while(op!=5);

        }

        
    
}