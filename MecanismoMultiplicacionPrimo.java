
/**
 * Write a description of class MecanismoMultiplicacionPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int numeroPrimo;

    /**
     * Constructor for objects of class MecanismoMultiplicacionPrimo
     */
    public MecanismoMultiplicacionPrimo(int numeroPrimo)
    {
        this.numeroPrimo = numeroPrimo;        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public int getNumeroEncriptado(int numero)
    {        
        return numero * numeroPrimo;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public int getNumeroDesencriptado(int numero)
    {        
        return numero / numeroPrimo;
    }
}
