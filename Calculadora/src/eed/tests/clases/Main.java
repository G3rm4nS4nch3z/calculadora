/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eed.tests.clases;

/**
 *
 * @author Nayra Deniz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        Account cuentita;
        double saldo;
        
        cuentita = new Account("Pepa Santana","3333-1111-99-123456789");
        Account nueva = new Account("Nayra", "2222-1111-33-444444444");
        //Dejo este mensaje desde GitHub
        //Segundo cambio desde GitHub
        try
        {
            System.out.println("Ingreso en las dos cuentas");
            cuentita.ingresar(-1695);
            nueva.ingresar(300);
            
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al ingresar");
        } 
        
        try 
        {
            cuentita.retirar(-100);
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            cuentita.ingresar(300);
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al ingresar");
        } 
        
        saldo = cuentita.disponible();
        System.out.println("El saldo actual es "+ saldo );
    }

}
