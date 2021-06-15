public abstract class Quadrilateros implements FormaGeometrica{
    private double ladox;
    private double ladoy;
    private double ladoz;
    private double ladow;
public Quadrilateros(double ladox,double ladoy,double ladoz, double ladow){
    this.ladox = ladox;
    this.ladoy = ladoy;
    this.ladoz = ladoz;
    this.ladow = ladow;
}

public double Perimetro(double ladox){
    return this.ladox+this.ladoy+this.ladoz+this.ladow;
    }
    
}
