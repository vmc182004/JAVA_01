package Taller3;

public class P14 {
    public static void main(String[] args){
        //Usuarios y sus saldos 
        Punto14 persona1 = new Punto14("Valentina", 10000000, 2004);
        Punto14 persona2 = new Punto14("Katherine", 9500000, 2005);
        //se deposita al usuario
        System.out.println(persona1.depositar(10, 2004, "Valentina"));
        System.out.println(persona2.depositar(10, 2005, "Katherine"));
    
      }
    }
    

