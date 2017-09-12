/**
 * Esta clase representa objetos cuadrado con sus lados.
 * @author JLFMTZ
 * @version 1.0  (9-sep-17)
 */
public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float unLado)
    {
        lado = unLado;
    }
    
    @Override
    public void calcularArea()
    {
        area = lado * lado;
    }
    
    @Override
    public void calcularPer()
    {
        perimetro = 4 * lado;
    }
}