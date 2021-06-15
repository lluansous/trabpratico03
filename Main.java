public class Main{
    public static void main(String[]args){
        Retangulo retangulo = new Retangulo(12,12);
        Circulo circulo = new Circulo(4.5);
        Quadrado quadrado= new Quadrado(10);
        
        
        System.out.println("Circulo");
        System.out.println("Perimetro"+circulo.Perimetro());
        System.out.println("Area"+circulo.Area());
        
        System.out.println("Retangulo");
        System.out.println("Perimetro"+retangulo.Perimetro());
        System.out.println("Area"+retangulo.Area());
        
        System.out.println("Quadrado");
        System.out.println("Perimetro"+quadrado.Perimetro());
        System.out.println("Area"+quadrado.Area());
    }
    
}