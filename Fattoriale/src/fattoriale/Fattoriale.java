
package fattoriale;

public class Fattoriale {
    
    
    
    public static void main(String[] args) {
        double x;
        for(x=10;x>1;x--){
            Calcolo c = new Calcolo(x);
            c.start();
        }
        
    }
    
}
