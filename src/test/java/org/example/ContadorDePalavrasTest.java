package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContadorDePalavrasTest {

    @Test
    public void testContarPalavras() {
       ContadorDePalavras contador = new ContadorDePalavras();

       assertEquals(0, contador.contarPalavras(""));
       assertEquals(1, contador.contarPalavras("palavra"));
       assertEquals(2, contador.contarPalavras("palavra outra"));
       assertEquals(3, contador.contarPalavras("palavra outra mais"));
       assertEquals(4, contador.contarPalavras("    palavra  outra  mais  outra    "));
       assertEquals(0, contador.contarPalavras(null));
    }
}
