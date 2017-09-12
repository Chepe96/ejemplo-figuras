/**
 * Esta clase representa objetos triangulo con su base y altura.
 * @author JLFMTZ
 * @version 1.0  (9-sep-17)
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float unBase, float unAltura)
    {
        base = unBase;
        altura = unAltura;
    }
    
    @Override
    public void calcularArea()
    {
        area = (base * altura)/2;
    }
    
    @Override
    public void calcularPer()
    {
        perimetro = base + altura + (float)Math.sqrt((base * base) + (altura * altura));
    }
}