package com.example.usuario.junitprimos.pojo;

/**
 * Created by usuario on 8/11/17.
 */

public class Primo {


    /**
     * @param numero
     * @return esPrimo
     */
    public static boolean EsPrimo(int numero) {
        boolean esPrimo = true;
        int i = 2;

        if (numero < 2)
            esPrimo = false;

        while(i<numero && esPrimo){
            if (numero % i == 0)
                esPrimo = false;
            i++;
        }

        return esPrimo;
    }
}
