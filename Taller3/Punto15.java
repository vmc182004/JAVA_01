package Taller3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto15{
    public int num1, num2;
    
    public Punto15(int num1, int num2){
      this.num1 = num1;
      this.num2 = num2;
    }
  
    public int suma(){
      return this.num1 + this.num2;
    }
    public int resta(){
      return this.num1 - this.num2;
    }
    public int multiplicar(){
      return this.num1 * this.num2;
    }
    public int dividir(){
      return this.num1 / this.num2;
    }
}  