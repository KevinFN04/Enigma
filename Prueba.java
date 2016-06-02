
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Prueba
     */
    public Prueba()
    {
        // initialise instance variables
        x = 0;
    }

    public static boolean primo(int num)
    {
        boolean p = false;

        if (num < 4) p = true;
        else
        {
            if (num % 2 == 0) p = false; 
            else
            {
                int contador = 0;  
                int i = 1; 
                int limite = (num - 1) / 2; 
                if  (limite % 2 == 0) limite--;  

                while(i <= limite)
                {
                    if (num % i == 0) contador++;
                    i += 2;
                    if (contador == 2) i = limite + 1;
                }

                if (contador == 1) p = true;
            } 
        } 

        return p;
    }
}