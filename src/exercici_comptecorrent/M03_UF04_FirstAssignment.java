
package exercici_comptecorrent;


public class M03_UF04_FirstAssignment {
    public static void main(String[] args) throws Excepcio {
        // Prueba to código aquí
        
        CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
        System.out.println(cc1);
        cc1.ingresa(10000);
        System.out.println(cc1);
        cc1.abona(100);
        System.out.println(cc1); 
        
        
        
    }
}
