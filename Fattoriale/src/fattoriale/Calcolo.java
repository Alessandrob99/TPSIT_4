package fattoriale;


public class Calcolo extends Thread {
    private double n;
    public Calcolo(double n){
        this.n = n;
    }
    public void run(){
        double f=n;
        double x;
        for(x=n;x>1;x--){
            f=f*(x-1);
            
        }
        System.out.println("IL FATTORIALE DI "+n+" E'"+f);
    }
}
