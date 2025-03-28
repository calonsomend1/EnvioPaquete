import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - Carlos Alonso
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete() 
    {
        
        this.dimension = new Dimension(40, 30, 50);
        this.peso = 8;
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo) 
    {
        
        generador= new Random();
        this.dimension = new Dimension(alto, ancho, largo);
        
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)
    {
        //TODO
        this.dimension = dimension;
        
        this.peso = peso;

    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() 
    {
        return dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso()
    {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double getVolumen() 
    {
       //TODO
     
       return this.dimension.getVolumen();

    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double getPesoVolumetrico() 
    {
        //TODO

        double pesoVolumetrico = getVolumen()/5000; 
       return pesoVolumetrico;

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() 
    {
        //TODO
        
        if(peso < getPesoVolumetrico())
        {
            return getPesoVolumetrico();
        }
       return peso;
       
    }

    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete clone() 
    {
        //TODO
        Paquete paqueteClone = new Paquete (this.dimension, this.peso);
       return paqueteClone;

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() 
    {
       
        String longString = "";
       longString = longString+dimension +"\n"+"               peso:   "+getPeso()+"(Kg)"+"\n" 
       +"               Volumen:   "+getVolumen()+"(cm3)"+ "\n" 
       + "               Peso Volumétrico:   "
       +getPesoVolumetrico() +"(Kg)";
       return longString;

    }
    
        /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() 
    {
        System.out.println(this.toString());
    }

}
