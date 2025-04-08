public class cuentas {

    // Attributes
    private String nombre;
    private double saldo;
    private String contrasena;


    //constructor
    public cuentas(String nom, double saldo, String contrasena) {
        this.nombre = nom;
        this.saldo = saldo;
        this.contrasena = contrasena;
    }

    //setters
    public void setContrasena(String contra) {
        this.contrasena = contra;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //getters

    public String getContrasena() {
        return this.contrasena;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // behaviors

    //retiro
    //obtiene el saldo del objeto del cual se llama el metodo
    //obtiene retiro del usuario y lo resta al saldo
    //las excepciones son de si el retiro es mayor al saldo
    // y si ingresa letras en vez de numeros
    public void retiro(double monto) {
        this.saldo -= monto;
    }

    public void deposito(double deposito) {
        this.saldo += deposito;
    }

    public void transferencia(cuentas destino, double transferencia) {
        this.saldo -= transferencia;
        destino.recibirTransferencia(transferencia);
    }

    public void recibirTransferencia(double monto) {
        this.saldo += monto;
    }
}
