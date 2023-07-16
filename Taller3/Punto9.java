package Taller3;
import java.lang.Math;
import java.util.Scanner;

class Punto9 {
    public static double celsius_F(double t){
      double f = (t * 9/5) + 32;
      return f;
    }
  public static double celsius_K(double t){
      double k = t +  273.15;
      return k;
    }

      public static double fare_C(double t){
      double c = (t - 32) * 5/9 ;
      return c;
    }

    public static double fare_K(double t){
      double k = (t - 32) * 5/9 + 273.15 ;
      return k;
    }

    public static double kelvin_c(double t){
      double c = t - 273.15;
      return c;
    }

   public static double kelvin_f(double t){
      double f = (t - 273.15) * 9/5 + 32;
      return f;
    }
  public static void main(String[] args) {
    
     Scanner reader = new Scanner(System.in);
     System.out.println("Ingresa la temperatura ");	
     double temp = reader.nextDouble();
     System.out.println("Ingresa la unidad 1:Centigrados* 2:Fahrenheit* 3:Kelvin*");	
     int unidad = reader.nextInt();
     
      int unidad_f;
    if(unidad == 1 ){
      System.out.println("Ingresa la unidad final a mostrar 2:Fahrenheit* 3:Kelvin*");	
       unidad_f = reader.nextInt();

      if(unidad_f == 2){
         System.out.println("Fahrenheit*:"+celsius_F(temp));
        
      }else if(unidad_f == 3){
        System.out.println("kelvin*:"+celsius_K(temp));
      }
    }else if(unidad == 2){
       System.out.println("Ingresa la unidad final a mostrar 1:Centigrados* 3:Kelvin*");	
       unidad_f = reader.nextInt();

       if(unidad_f == 1){
         System.out.println("Centigrados*:"+fare_C(temp));
        
      }else if(unidad_f == 3){
        System.out.println("kelvin*:"+fare_K(temp));
      }
    }else if(unidad == 3){
       System.out.println("Ingresa la unidad final a mostrar 1:Centigrados* 2:Fahrenheit*");	
       unidad_f = reader.nextInt();

       if(unidad_f == 1){
         System.out.println("Centigrados*:" + kelvin_c(temp));
        
      }else if(unidad_f == 2){
        System.out.println("Fahrenheit*:" + kelvin_f(temp));
      }
    } 
  }
}