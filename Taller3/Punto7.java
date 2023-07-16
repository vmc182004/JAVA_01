package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String cadena, urg, cita,citas;
        int op,opc,opci;

        do{
        cadena=JOptionPane.showInputDialog(null,"ELIJA UNA OPCIÓN DE LA EPS:\n"+"1.URGENCIAS\n"+"2.CITAS\n"+"3.SALIR\n"); 
        op=Integer.parseInt(cadena);

        switch(op){
            case 1:
            do{
                urg=JOptionPane.showInputDialog(null,"ESTAS EN URGENCIAS:\n1=URGENCIA POR COVID\n2=URGENCIA EN GENERAL\n3=UN ACCIDENTE\n4=MENÙ PRINCIPAL");
                opc=Integer.parseInt(urg);
                switch(opc){
                    case 1:
                    JOptionPane.showMessageDialog(null,"MANTENGASE EN CUARENTENA");
                    break;

                    case 2:
                    JOptionPane.showMessageDialog(null,"DIRIJASE AL HOSPITAL");
                    break;

                    case 3:
                    JOptionPane.showMessageDialog(null,"ESPERE LA AMBULANCIA");
                    break;
                }
                
            }while(opc!=4);
            break;

            case 2:
            do{
            cita=JOptionPane.showInputDialog(null,"ESTAS EN ZONA DE CITAS:\n1=AGENDAR\n2=CANCELAR\n3=MENU PRINCIPAL");
            opc=Integer.parseInt(cita);
            switch(opc){
                case 1:
                do{
                citas=JOptionPane.showInputDialog(null, "ESTAS EN AGENDAR:\n1=MEDICO GENERAL\n2=CITA CON PEDIATRA\n3=CITA CON OFTALMOLOGO\n4=CITA CON PSICOLOGO\n5=CITA PARA PLANIFICAR\n6=SALIR");
                opci=Integer.parseInt(citas);
                    switch(opci){
                        case 1:
                        JOptionPane.showMessageDialog(null, "CITA AGENDADA CON MEDICO GENERAL");
                        break;

                        case 2:
                        JOptionPane.showMessageDialog(null, "CITA AGENDADA CON MEDICO PEDIATRA");
                        break;

                        case 3:
                        JOptionPane.showMessageDialog(null, "CITA AGENDADA CON OFTALMOLOGO");
                        break;

                        case 4:
                        JOptionPane.showMessageDialog(null, "CITA AGENDADA CON PSICOLOGO");
                        break;

                        case 5:
                        JOptionPane.showMessageDialog(null, "CITA AGENDADA PARA PLANIFICAR");
                        break;
                    }
                }while(opci!=6);
                break;

                case 2:
                do{
                citas=JOptionPane.showInputDialog(null, "ESTAS EN CANCELAR CITAS:\n1=MEDICO GENERAL\n2=CITA CON PEDIATRA\n3=CITA CON OFTALMOLOGO\n4=CITA CON PSICOLOGO\n5=CITA PARA PLANIFICAR\n6=SALIR");
                opci=Integer.parseInt(citas);
                switch(opci){
                    case 1:
                        JOptionPane.showMessageDialog(null, "CITA CANCELADA CON MEDICO GENERAL");
                        break;

                        case 2:
                        JOptionPane.showMessageDialog(null, "CITA CANCELADA CON MEDICO PEDIATRA");
                        break;

                        case 3:
                        JOptionPane.showMessageDialog(null, "CITA CANCELADA CON OFTALMOLOGO");
                        break;

                        case 4:
                        JOptionPane.showMessageDialog(null, "CITA CANCELADA CON PSICOLOGO");
                        break;

                        case 5:
                        JOptionPane.showMessageDialog(null, "CITA CANCELADA PARA PLANIFICAR");
                        break;
                }
                }while(opci!=6);
                break;
            }
            }while(opc!=3);
            break;
        }
        }while(op!=3);
        JOptionPane.showMessageDialog(null, "SALIENDO DEL SISTEMA");
    }
}
