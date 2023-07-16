package Taller3;
import java.util.Scanner;

class Punto16 {
  public static void clasificacion(float imc){
    if(imc < 18.5){
      System.out.println("Bajo de peso");
    }else if(imc >= 18.5 && imc <=24.9){
        System.out.println("Peso normal");
      
    }else if(imc > 24.9 && imc <= 29.9){
      System.out.println("Sobrepeso");
    }else if(imc >= 30.0){
       System.out.println("Obesidad");
    }
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

      System.out.println("Datos persona 1 \n");
      System.out.println("Ingresa el nombre");	
     String nombre  = reader.nextLine();

    System.out.println("Ingresa la edad");	
     int edad  = reader.nextInt();

     System.out.println("Ingresa el sexo");	
    char sexo = reader.next().charAt(0);

     System.out.println("Ingrese peso");	
    float peso  = reader.nextFloat();

    System.out.println("Ingrese altura");	
     float altura  = reader.nextFloat();

    Persona person1 = new Persona(nombre, edad,sexo, peso,altura); 

    System.out.println("IMC:" + person1.calcularIMC());	
    clasificacion( person1.calcularIMC());
    
    if(person1.esMayorDeEdad()){
      System.out.println("Es mayor de edad");	
    }else{
       System.out.println("Es menor de edad");	
    }
    person1.comprobarSexo();
    person1.muestraInfo();
    
     System.out.println("\n");
    System.out.println("Datos persona 2 \n");
      
    System.out.println("Ingresa el nombre");	
     String nombre_2  = reader.nextLine();
    reader.nextLine();
    System.out.println("Ingresa la edad");	
     int edad_2  = reader.nextInt();

     System.out.println("Ingresa el sexo");	
    char sexo_2 = reader.next().charAt(0);
     Persona person2 = new Persona(nombre_2, edad_2,sexo_2); 
    System.out.println("\n");
     System.out.println("IMC:" + person2.calcularIMC());	
    clasificacion( person2.calcularIMC());
    if(person2.esMayorDeEdad()){
      System.out.println("Es mayor de edad");	
    }else{
       System.out.println("Es menor de edad");	
    }
    person2.comprobarSexo();
    person2.muestraInfo();
    
     Persona person3 = new Persona();
     

    System.out.println("\n");
    System.out.println("Datos persona 3 \n");
     System.out.println("IMC:" + person3.calcularIMC());	
    clasificacion( person3.calcularIMC());
    if(person3.esMayorDeEdad()){
      System.out.println("Es mayor de edad");	
    }else{
       System.out.println("Es menor de edad");	
    }
    person3.comprobarSexo();
    person3.muestraInfo();
    System.out.println("\n");
  }
}
