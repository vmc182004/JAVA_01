package Taller3;
import java.util.Scanner;
public class Punto6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int SistemaWin = 0;
        int UsuarioWin = 0;

        do {
            int piedra_papel_tijeras;
            //(Math.random()*(1-4)+4) <= [1] , [2] y [3]
            piedra_papel_tijeras = (int)(Math.random()*(1-3)+3);
    
            System.out.println("Genera al azar piedra, papel o tijera: ");
            int mano = (int)(Math.random()*3);
    
            int Piedra = 0;
            int Papel = 1;
            int Tijera = 2;
    
            switch(piedra_papel_tijeras){
                case 0:
                System.out.println("Piedra");
                break;
    
                case 1:
                System.out.println("Papel");
                break;
    
                case 2:
                System.out.println("Tijera");
                break;
                default:
            }
            switch(mano){
                case 0:
                System.out.println("Piedra");
                break;
    
                case 1:
                System.out.println("Papel");
                break;
    
                case 2:
                System.out.println("Tijera");
                break;
            }
            if(piedra_papel_tijeras==Piedra && mano == Papel){
    
                System.out.println("El usuario gana");
                System.out.println("EL sistema pierde");
                UsuarioWin = UsuarioWin +1;
    
            }else if(piedra_papel_tijeras == Papel && mano == Piedra){
    
                System.out.println("Gana el sistema");
                System.out.println("El usuario pierde");
                SistemaWin = SistemaWin + 1;
    
            }else if(piedra_papel_tijeras == Tijera && mano == Papel){
    
                System.out.println("Gana el sistema");
                System.out.println("El usuario pierde");
                SistemaWin = SistemaWin + 1;
    
            }else if(piedra_papel_tijeras == Papel && mano == Tijera){
                
                System.out.println("El usuario Gana");
                System.out.println("El sistema pierde");
                UsuarioWin = UsuarioWin +1;
    
            }else if(piedra_papel_tijeras == Piedra && mano == Tijera){
    
                System.out.println("Gana el sistema");
                System.out.println("El usuario pierde");
                SistemaWin = SistemaWin + 1;
    
            }else if(piedra_papel_tijeras == Tijera && mano == Piedra){
                
                System.out.println("El usuario Gana");
                System.out.println("El sistema Pierde");
                UsuarioWin = UsuarioWin +1;

            }else if(piedra_papel_tijeras == Tijera && mano == Tijera){
                
                System.out.println("Es un Empate");
    
            }else if(piedra_papel_tijeras == Papel && mano == Papel){
                
                System.out.println("Es un Empate");
    
            }else if(piedra_papel_tijeras == Piedra && mano == Piedra){
                
                System.out.println("Es un Empate");
    
            }
        
        } while (SistemaWin == 3 || UsuarioWin == 3);
 
    }
}
