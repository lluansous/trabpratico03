public class Retangulo implements FormaGeometrica{
    // vari�veis de inst�ncia - substitua o exemplo abaixo pelo seu pr�prio
    private double base;
    private double altura;
    
    public Retangulo (double base, double altura){
        
        this.base = base;
        this.altura = altura;
    }
    
    public double Perimetro(){
        return (base*2)+(altura*2);
    }
    public double Area(){
    return (base*altura);
      }      
        
}
