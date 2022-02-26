package Cuentas;

/**
 * Esta clase es la que usamos en la tarea 04 de EEDD
 * @author Mario Cordero Escobar
 * @version 1.0
 */
public class Main {

     /**
     * Metodo main
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * Metodo operativa_cuenta que opera sobre una cuenta
     * @param cantidad Cantidad que se retirará/ingresará en la cuenta (Cómo no se ha indicado nada, no he modificado nada)
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
    
}
