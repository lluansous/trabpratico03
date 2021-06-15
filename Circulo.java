public class Circulo implements FormaGeometrica{
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
}

public double Perimetro(){
    return raio*3.14*2;
}

public double Area(){
    return (raio*raio)*3.14;
}

}
