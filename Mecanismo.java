
/**
 * Abstract class Mecanismo - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Mecanismo
{
    // instance variables - replace the example below with your own
    private int numeroOriginal;

     /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo()
    {     
    }    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public int getNumeroOriginal()
    {
        return numeroOriginal;
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public abstract int getNumeroEncriptado(int numero);
    
    /**
     * An example of a method - replace this comment with your own
     */
    public abstract int getNumeroDesencriptado(int numero);
    
}
