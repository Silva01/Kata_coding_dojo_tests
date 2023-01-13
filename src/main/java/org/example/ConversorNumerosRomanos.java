package org.example;

public class ConversorNumerosRomanos {

    public String converter (Integer numero) {
        int[] numeros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letras = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String resultado = "";

        for (int i = 0; i < numeros.length; i++) {
            while (numero >= numeros[i]) {
                resultado += letras[i];
                numero -= numeros[i];
            }
        }

        return resultado;
    }
}
