package Taller3;
public class Punto14{
    //Se declaran variables y Si son publicas, privadas o protegidas
    public String nombre;
    static private int quantityUsers = 10;
    public float saldo;
    public int Contraseña;
    static public int counter = 0;
    static public String[][] users = new String[quantityUsers][2];
    
    public Punto14(String nombre, float saldo, int Contraseña){
      //Cada vez que se crea un usuario la clase guarda sus datos
      this.nombre = nombre + Integer.toString(counter);
      this.saldo = saldo;
      this.Contraseña = Contraseña;
      Punto14.counter++;
      Punto14.users[counter][0] = nombre;
      Punto14.users[counter][1] = Float.toString(saldo);
    }
  
    public String consulta_titula(){
      return this.nombre;
    }
  
    public float consulta_saldo(int Contraseña){
      //Si la contraseña es igual a la creada entonces puede consultar el saldo.
      return Contraseña == this.Contraseña ? this.saldo : 0;
    }
  
    public String depositar(float deposito, int Contraseña, String persona_deposito){
  
      if (deposito > this.saldo && Contraseña != this.Contraseña){
        return "ERROR";
      }
      boolean existPerson = false;
      for (int i = 0; i < Punto14.users.length; i++){
        if (Punto14.users[i][0] == persona_deposito){
          String result = Float.toString(Float. parseFloat(Punto14.users[i][1]) + deposito);
          Punto14.users[i][1] += result;
          existPerson = true;
          break;
        }
      }//Comprueba si el usuario ingresado existe para poder 
      if (existPerson){
        this.saldo -= deposito;
        return "Deposito satisfactorio a: " + persona_deposito;
      }
      return "Usuario no encontrado";
    }
}