public class Arreglos2 {
    public static void main(String[] args){
        //declarar arreglo
        String aprendices[];
        //crear arreglo
        aprendices= new String[5];
        //modificar arreglo
        aprendices[0]="Valeria";
        aprendices[1]="ValentinaM";
        aprendices[2]="ValentinaR";
        aprendices[3]="Katherine";
        aprendices[4]="Antonio";
        System.out.println(aprendices);
        for (int i=0; i<aprendices.length; i++){
            System.out.println(aprendices[i]);
        }
        
    }
    
}
