package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ContadorDePalavras {
    public int contarPalavras(String texto) {
        return Optional.ofNullable(texto)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(s -> s.split("\\s+"))
                .map(Arrays::asList)
                .map(List::size)
                .orElse(0);
    }
}
