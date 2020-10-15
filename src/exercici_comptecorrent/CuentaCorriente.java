
package exercici_comptecorrent;


public class CuentaCorriente extends Exception{
    
    // Propiedades
    private String titular;
    private double saldo;
    private int error;
    private String missatge;
    
    // Constructor
    public CuentaCorriente(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        
    }
    
    // Getters/Setters
     public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public double getSaldo() {
        return saldo;
    }
    
    
    // Métodos heredados
    @Override    
    public String toString() {
        return "CuentaCorriente{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    // Métodos adicionales
    
    /* El método ingresa acumula ingreso en saldo */
    public void ingresa(double ingreso) {
        this.saldo+=ingreso; 
        //Creem un nou objecte de la nostra classe d'excepcions.
        Excepcio ex = new Excepcio(2);
        //Si vols ingressar 10.000€ o més, sortirà el missatge d'error corresponent.
        if(ingreso >=10000){
        throw new IllegalArgumentException(ex.missatgeError());
        }
    }

    
    /* El método abona resta abono de saldo */ 
    public void abona(double abono) {
        //Creem un nou objecte de la nostra classe d'excepcions.
        Excepcio ex = new Excepcio(1);
        this.saldo-=abono;
        //Si el pagament es major al teu sou, sortirà e missatge d'error corresponent.
        if(abono > saldo){
           throw new IllegalArgumentException(ex.missatgeError());
        }
    }
  
}
