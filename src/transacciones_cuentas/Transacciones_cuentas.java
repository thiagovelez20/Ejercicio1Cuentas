
package transacciones_cuentas;

import java.util.Scanner;
public class Transacciones_cuentas {

  
    public static void main(String[] args) {
        // TODO code application logic here
       
      Scanner sc = new Scanner(System.in);
      String nombre;
      double saldo;
      
      System.out.println("Ingrese su nombre por favor ! " );
      nombre= sc.nextLine();
      
      System.out.println("Ingrese el Saldo a la Cuenta");
      saldo = sc.nextDouble();
      
      System.out.println(" El Nombre del Usuario es: " + nombre + " Tiene un Saldo en la Cuenta " + saldo + " Pesos");
       
      double retiro, deposito;
      
      System.out.println("Ingrese el valor que desea Depositar");
      deposito = sc.nextDouble();
      
      double total = saldo + deposito;
      System.out.println(" El Nombre del Usuario es: " + nombre + " Tiene un nuevo Saldo en tu Cuenta " + total + " Pesos ");
      
      System.out.println("Ingrese un nuevo Saldo para Retirar");
      retiro= sc.nextDouble();
      
      double resultado = total - retiro;
      System.out.println(" El Nombre del Usuario es: " + nombre+ " Tiene un nuevo Saldo en tu Cuenta " + resultado + " Pesos ");
      
      
      
    }
}
