package Taller3;

public class Persona {
    String nombre;
    int edad  ;
    String ID ; 
    char sexo;
    float peso ;
    float altura ;
  
    Persona(){
      this.nombre = "Ricardo";
      this.edad = 18;
      this.ID = "1881363";
      this.sexo = 'M';
      this.peso = 70;
      this.altura = (float)1.89;
    }
    Persona(String nombre,int edad, char sexo, float peso, float altura){
      this.ID = "1881363";
      this.nombre = nombre;
      this.edad = edad;
      this.sexo = sexo;
      this.peso = peso;
      this.altura = altura;
    }
  
      Persona(String nombre,int edad, char sexo){
      this.ID = "1881363";
      this.nombre = nombre;
      this.edad = edad;
      this.sexo = sexo;
      this.peso = 70;
      this.altura = (float)1.89;
    }
    
    float calcularIMC(){
      float IMC = (this.peso/(this.altura * this.altura));
      return IMC;
    }
    boolean esMayorDeEdad(){
      if(this.edad >= 18){
        return true;
      }else{
        return false;
      }
        
    }
  void comprobarSexo(){
    if(this.sexo == 'M' || this.sexo == 'F'){
     System.out.println("Sexo valido!");
    }else{
       System.out.println("Sexo Invalido! Asignado H");
      this.sexo = 'H';
    }
  }
  
    void muestraInfo(){
      System.out.println("Nombre:" + this.nombre);
      System.out.println("Edad:" + this.edad);
      System.out.println("ID:" + this.ID);
      System.out.println("Sexo:" + this.sexo);
      System.out.println("Peso:" + this.peso);
      System.out.println("Altura:" + this.altura);
    }
    
  }