public class EjercicioBanco{
    public static void main(String[] args){
        //CUENTA 1
        Ban banco_1 = new Ban();
        String newtitular=banco_1.nombretitular("valentina");
        System.out.println("Titular cuenta 1:"+newtitular);
        double newsaldo=banco_1.ingresarsaldo(5000);
        System.out.println("Saldo actualizado:"+newsaldo);
        double newretiro=banco_1.sacarsaldo(400);
        System.out.println("Saldo actualizado:"+newretiro);
        System.out.println("\n");
        //CUENTA 2
        Ban banco_2 = new Ban();
        String newtitular2=banco_2.nombretitular("Maria");
        System.out.println("Titular cuenta 2:"+newtitular2);
        double newsaldo2=banco_2.ingresarsaldo(10000);
        System.out.println("Saldo actualizado:"+newsaldo2);
        double newretiro2=banco_2.sacarsaldo(2000);
        System.out.println("Saldo actualizado:"+newretiro2);
       
    }
}