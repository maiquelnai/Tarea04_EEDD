package Cuentas;
/**
 * Esta clase es la que usamos en la tarea 04 de EEDD almacena una cuenta
 * @author Mario Cordero Escobar
 * @version 1.0
 */

public class CCuenta {


    /**
     * Atributos de clase
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    float cantidad;

    /**
     * Constructor sin argumentos
     */
    public CCuenta()
    {
    }

     /** Constructor con argumentos para inicializar los atributos de clase
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }


    /**
     * Método que devuelve el nombre del titular
     * @return el atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del titular
     * @param nombre El nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el código de cuenta
     * @return el atributo cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que establece el CC
     * @param cuenta El código de cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo
     * @return el atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que establece el saldo de la cuenta
     * @param saldo El saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que obtiene el tipo de interés
     * @return el atributo tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que establece el tipo de interés
     * @param tipoInterés El nuevo tipo de interés a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Método que devuelve el saldo (tras las operaciones en el punto 1 de la tarea, este método ya no sería necesario
     * @return El saldo... cómo antes devolvía el atributo saldo, ahora llama al método get del atributo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que ingresa una cantidad en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad a ingresar es negativa, dará error
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que retira dinero de la cuenta
     * @param cantidad Cantidad a retirar de la cuenta
     * @throws Exception  Si el saldo es negativo o la cantidad a ingresar, da error
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
