public class Ban {
    //Atributos
    String nomtitular;
    double saldocuenta;

    //constructor
    public Ban (){
        saldocuenta=0;
    }
    
    //metodos
    public String nombretitular(String nomtitular){

        return nomtitular;
        
    }
    public double ingresarsaldo (double ingreso){
        if (ingreso<=0)
        System.out.println("El ingreso debe ser superior a cero");
        else
            saldocuenta= saldocuenta+ingreso;
        return saldocuenta;
    }
    public double sacarsaldo (double retiro){
        if(retiro<=0)
        System.out.println("El retiro debe ser superior a cero");
        else
            saldocuenta= saldocuenta-retiro;
        return saldocuenta;
    }

    /*public String nomtitular(String string) {
        return null;
    }*/
}