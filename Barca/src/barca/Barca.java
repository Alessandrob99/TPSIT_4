
package barca;


public class Barca{
    private float x;
    private float y;
    public void Barca(float x, float y){
        this.x = 0;
        this.y = 0;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setLocation(float x,float y){
        this.x = this.x+x;
        this.y = this.y+y;
    }
}
