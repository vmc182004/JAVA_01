import java.util.Scanner;

public class Arreglos4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        String pal;
        String palabras[];
        palabras = new String[6];

        palabras[0] = "Mesa";
        palabras[1] = "Silla";
        palabras[2] = "Computador";
        palabras[3] = "Cargador";
        palabras[4] = "Memoria";
        palabras[5] = "Televisor";

        System.out.println("INGRESE UN NÚMERO DEL 1 AL 6");
        num = reader.nextInt();

        switch (num) {
            case 1:
                System.out.println(palabras[0]);
                break;

            case 2:
                System.out.println(palabras[1]);
                break;

            case 3:
                System.out.println(palabras[2]);
                break;

            case 4:
                System.out.println(palabras[3]);
                break;

            case 5:
                System.out.println(palabras[4]);
                break;

            case 6:
                System.out.println(palabras[5]);
                break;

        }

    }
}