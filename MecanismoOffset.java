import java.util.*;
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int a;

    /**
     * Constructor for objects of class MecanismoMultiplicacionPrimo
     */
    public MecanismoOffset(int a)
    {
        this.a = a;        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public int getNumeroEncriptado(int numero)
    {        
        String sNumero = "" + numero;
        int tamaño = sNumero.length();
        int primerDigito = Integer.parseInt((sNumero.substring(0, 1)));
        int demasDigitos = Integer.parseInt((sNumero.substring(1, tamaño)));
        int numeroEncriptado = numero;
        if (numero > 10){
            ArrayList<Integer> numeros = new ArrayList<>();
            while(demasDigitos>0){
                int numero2;
                numeros.add(demasDigitos % 10);
                demasDigitos/=10;            
            }
            int count = 1;
            int multiplo = 10;
            numeroEncriptado = numeros.get(0) + 2;
            while (count < numeros.size()){
                int cuenta = numeros.get(count) + 2;
                if (cuenta >= 10){
                    cuenta -= 10;
                }
                numeroEncriptado += cuenta * multiplo;
                multiplo *= 10;
                count++;
            }
            numeroEncriptado += primerDigito * (multiplo);
        }
        return numeroEncriptado;
    }

    public int getNumeroDesencriptado(int numero){
        String sNumero = "" + numero;
        int tamaño = sNumero.length();
        int primerDigito = Integer.parseInt((sNumero.substring(0, 1)));
        int demasDigitos = Integer.parseInt((sNumero.substring(1, tamaño)));
        int numeroEncriptado = numero;
        if (numero > 10){
            ArrayList<Integer> numeros = new ArrayList<>();
            while(demasDigitos>0){
                int numero2;
                numeros.add(demasDigitos % 10);
                demasDigitos/=10;            
            }
            int count = 1;
            int multiplo = 10;
            numeroEncriptado = numeros.get(0) - 2;
            while (count < numeros.size()){
                int cuenta = numeros.get(count) - 2;
                if (cuenta < 0){
                    cuenta += 10;
                }
                numeroEncriptado += cuenta * multiplo;
                multiplo *= 10;
                count++;
            }
            numeroEncriptado += primerDigito * (multiplo);
        }
        return numeroEncriptado;
    }
}

