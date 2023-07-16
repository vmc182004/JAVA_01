public class Main{
    public static void main(String[] args){
        Car Valentina_Car = new Car();
        System.out.println("color de valentina:"+Valentina_Car.color);
        int newposition=Valentina_Car.MoverForward(1000);
        System.out.println("Nueva posición Valentina: " + newposition);
        System.out.println("Licencia valentina:"+Valentina_Car.license);

        Car Valeria_Car = new Car("ABC-456");
        Valeria_Car.color="black";
        System.out.println("color de valeria:"+Valeria_Car.color);
        int newposicion=Valeria_Car.retroceder(50);
        System.out.println("Nueva posición Valeria: " + newposicion);
        System.out.println("Licencia valeria:"+Valeria_Car.license);
    }
}