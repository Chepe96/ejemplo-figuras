/**
 * Esta clase es una super clase para representar las caracteristicas
 * comunes de muchas figuras.
 * 
 * @author JLFMTZ
 * @version 1.0 (8-sep-17)
 */
public class Figura
{
    protected float area; //area de cada figura
    
    /**
     * Constructor de la clase figura.
     */
    public Figura()
    {
        area = 0;
    }
    
    /**
     * Calcula el area de la figura.
     */
    public void calcularArea()
    {
        System.out.println("No se como calcular el area por que no se de figura se trata");
    }
    
    /**
     * Imprime el area de la figura.
     */
    public void imprimirArea()
    {
        System.out.println("El area de la figura es: " + area);
    }
}