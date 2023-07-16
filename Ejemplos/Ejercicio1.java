import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        String nom;
        String resp;
        String res, cedula;
        System.out.println("Opcion 1= cita de ojos");
        System.out.println("Opcion 2= cita con medico general ");
        System.out.println("Opcion 3= cita con planificacion");
        System.out.println("Opcion 4= cita de odontologia");
        System.out.println("Opcion 5= cita de psiquiatria");
        System.out.println("Elija una opción: ");
        int opcion= reader.nextInt();
        switch(opcion){
            case 1:
            System.out.println("¿Desea agendar cita con el oftalmologo?");
            break;

            case 2: 
            System.out.println("Desea agendar una cita con el medico general");
            resp=reader.nextLine();
            System.out.println("INGRESE SU NOMBRE");
            nom= reader.nextLine();
            if (opcion == 2) {
               
                System.out.println("Cita agendada " + nom);
            }
            break;

            case 3:
            System.out.println("¿Desea agendar una cita con el ginecologo?");
            break;

            case 4:
            System.out.println("¿Desea agendar una cita con el odontologo?");
            resp=reader.nextLine();
            System.out.println("INGRESE SU NOMBRE");
            nom= reader.nextLine();
            res=reader.nextLine();
            System.out.println("INGRESE SU CEDULA");
            cedula= reader.nextLine();
            if (opcion == 4) {
               
                System.out.println("Su cita queda agendada para el dia 28 de octubre "
                 + nom + " identificad@ con " + cedula);
            }
            break;

            case 5:
            System.out.println("¿Desea agendar una cita con el psiquiatra?");
            break;





            

        }

    }
}
