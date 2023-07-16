public class Car {
    //Atributos
    String color= "blue";
    String license;
    String brand;
    int position;
    int posicion=500;
    boolean switched_on =true;
    //constructor
    public Car (){
        color="yellow";
        license="ABC-123";
        position=0;
    }

    public Car (String mylicense){
        license=mylicense;
    }

    
    //metodos
    public int MoverForward (int distance){
        position=position+distance;
        return position;
    }
    public int retroceder (int distancia){
        posicion=posicion-distancia;
        return posicion;
    }
}
