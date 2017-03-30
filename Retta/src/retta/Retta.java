
package retta;


public class Retta {
    double a,b,c;
    public Retta(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getTipo(){
        if((this.a!=0)&&(this.b!=0)){
            return "Obliqua";
        }
        if(this.a==0){
            return "Orizzontale";
        }
        if(this.b==0){
            return "Verticale";
        }
        return "";
    }
    public boolean appartiene(double x,double y){
        if(((this.a*x)+(this.b*y)+this.c)==0){
            return true;
        }
        return false;
    }
    public String stampa(){
        String r="";
        if(this.a!=0){
            r+=this.a+"x";
        }
        if(this.b!=0){
            if(this.b!=0){
                r+="+";
            }
            r+=this.b+"y";
        }
        if(this.c!=0){
            if(this.c>0){
                r+="+";
            }
            r+=this.c;
        }
        r+="=0";
        return r;
    }
}
    
