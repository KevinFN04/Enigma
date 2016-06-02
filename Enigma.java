
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{    
    
    
    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
        
    }
    
    public int encripta(Mecanismo mecanismo, int numero){
        int resultadoDelEncriptado = mecanismo.getNumeroEncriptado(numero);
        if (numero <= 10){
            resultadoDelEncriptado = -1;
        }
        return resultadoDelEncriptado;
    }
    
    public int desencripta(Mecanismo mecanismo, int numero){
        int resultadoDelDesencriptado = mecanismo.getNumeroDesencriptado(numero);
        if (resultadoDelDesencriptado <= 10){
            resultadoDelDesencriptado = -1;
        }
        return resultadoDelDesencriptado;
    }
}
