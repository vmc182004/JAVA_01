package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String cadena, urg, cita,citas;
        int op,opc,opci;
    
        cadena=JOptionPane.showInputDialog(null,"ELIJA UNA OPCIÓN DE LA EPS:\n"+"1.URGENCIAS\n"+"2.CITAS\n"+"3.SALIR\n"); 
        op=Integer.parseInt(cadena);
        switch(op){
            case 1:
            urg=JOptionPane.showInputDialog(null,"ESTAS EN URGENCIAS:\n1=URGENCIA POR COVID\n2=URGENCIA EN GENERAL\n3=UN ACCIDENTE");
            opc=Integer.parseInt(urg);
            if (opc==1){
                JOptionPane.showMessageDialog(null,"MANTENGASE EN CUARENTENA");
            }
            else if (opc==2){
                JOptionPane.showMessageDialog(null,"DIRIJASE AL HOSPITAL");
            }
            else if (opc==3){
                JOptionPane.showMessageDialog(null,"ESPERE LA AMBULANCIA");
            }
            break;
            case 2:
            cita=JOptionPane.showInputDialog(null,"ESTAS EN ZONA DE CITAS:\n1=AGENDAR\n2=CANCELAR\n3=SALIR");
            opc=Integer.parseInt(cita);
            if (opc==1){
                citas=JOptionPane.showInputDialog(null, "ESTAS EN AGENDAR:\n1=MEDICO GENERAL\n2=CITA CON PEDIATRA\n3=CITA CON OFTALMOLOGO\n4=CITA CON PSICOLOGO\n5=CITA PARA PLANIFICAR\n");
                opci=Integer.parseInt(citas);

                if (opci==1){
                    JOptionPane.showMessageDialog(null, "CITA AGENDADA CON MEDICO GENERAL");
                }
                else if (opci==2){
                    JOptionPane.showMessageDialog(null,"CITA AGENDADA CON PEDIATRA");
                }
                else if (opci==3){
                    JOptionPane.showMessageDialog(null,"CITA AGENDADA CON OFTALMOLOGO");
                }
                else if (opci==4){
                    JOptionPane.showMessageDialog(null,"CITA AGENDADA CON PSICOLOGO");
                }
                else if (opci==5){
                    JOptionPane.showMessageDialog(null,"CITA AGENDADA PARA PLANIFICAR");
                }
            }
            else if(opc==2){
                citas=JOptionPane.showInputDialog(null, "ESTAS EN CANCELAR CITAS:\n1=MEDICO GENERAL\n2=CITA CON PEDIATRA\n3=CITA CON OFTALMOLOGO\n4=CITA CON PSICOLOGO\n5=CITA PARA PLANIFICAR\n");
                opci=Integer.parseInt(citas);

                if (opci==1){
                    JOptionPane.showMessageDialog(null, "CITA CANCELADA CON MEDICO GENERAL");
                }
                else if (opci==2){
                    JOptionPane.showMessageDialog(null,"CITA CANCELADA CON PEDIATRA");
                }
                else if (opci==3){
                    JOptionPane.showMessageDialog(null,"CITA CANCELADA CON OFTALMOLOGO");
                }
                else if (opci==4){
                    JOptionPane.showMessageDialog(null,"CITA CANCELADA CON PSICOLOGO");
                }
                else if (opci==5){
                    JOptionPane.showMessageDialog(null,"CITA CANCELADA PARA PLANIFICAR");
                }
            }
            break;
        }
        

}
}
