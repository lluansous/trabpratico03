public class Quadrado implements FormaGeometrica{
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    public double Perimetro(){
        return(lado*4);
        
    }
    
    public double Area(){
        return(lado*lado);
        
    }
        

}
