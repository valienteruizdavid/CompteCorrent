
package exercici_comptecorrent;


public class Excepcio extends Exception {
    //Posem un enter que faci referència a un codi d'error.
    private int error;
    
    public Excepcio(int codi){
        this.error = codi;
    }
    
    public String missatgeError(){
        
        String resultat = "";
        //Fem un switch case que, depenent el número de l'error, sortirà un missatge o un altre.
        switch (error){
            case 1:
                resultat = "No tens suficients diners";
                break;
            case 2:
                resultat = "no pots ingressar de cop 10.000€ o més";
                break;
        }
        return resultat;
    }
}
