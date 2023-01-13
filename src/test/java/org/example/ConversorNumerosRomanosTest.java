package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConversorNumerosRomanosTest {

    @Test
    public void testConverterNumerosInteirosEmNumerosRomanos() {
        ConversorNumerosRomanos conversor = new ConversorNumerosRomanos();

        assertEquals("I", conversor.converter(1));
        assertEquals("II", conversor.converter(2));
        assertEquals("III", conversor.converter(3));
        assertEquals("IV", conversor.converter(4));
        assertEquals("V", conversor.converter(5));
        assertEquals("VI", conversor.converter(6));
        assertEquals("VII", conversor.converter(7));
        assertEquals("VIII", conversor.converter(8));
        assertEquals("IX", conversor.converter(9));
        assertEquals("X", conversor.converter(10));
        assertEquals("XI", conversor.converter(11));
        assertEquals("XII", conversor.converter(12));
        assertEquals("XIII", conversor.converter(13));
        assertEquals("XIV", conversor.converter(14));
        assertEquals("XV", conversor.converter(15));
        assertEquals("XVI", conversor.converter(16));
        assertEquals("XVII", conversor.converter(17));
        assertEquals("XVIII", conversor.converter(18));
        assertEquals("XIX", conversor.converter(19));
        assertEquals("XX", conversor.converter(20));
        assertEquals("XXI", conversor.converter(21));
        assertEquals("XXII", conversor.converter(22));
        assertEquals("XXIII", conversor.converter(23));
        assertEquals("XXIV", conversor.converter(24));
        assertEquals("XXV", conversor.converter(25));
        assertEquals("XXVI", conversor.converter(26));
        assertEquals("XXVII", conversor.converter(27));
        assertEquals("XXVIII", conversor.converter(28));
        assertEquals("XXIX", conversor.converter(29));
        assertEquals("XXX", conversor.converter(30));
        assertEquals("XXXI", conversor.converter(31));
        assertEquals("XXXII", conversor.converter(32));
        assertEquals("XXXIII", conversor.converter(33));
        assertEquals("XXXIV", conversor.converter(34));
        assertEquals("XXXV", conversor.converter(35));
        assertEquals("XXXVI", conversor.converter(36));
        assertEquals("XXXVII", conversor.converter(37));
        assertEquals("XXXVIII", conversor.converter(38));
        assertEquals("XXXIX", conversor.converter(39));
        assertEquals("XL", conversor.converter(40));
        assertEquals("XLI", conversor.converter(41));
        assertEquals("XLII", conversor.converter(42));
        assertEquals("XLIII", conversor.converter(43));
        assertEquals("XLIV", conversor.converter(44));
        assertEquals("XLV", conversor.converter(45));
        assertEquals("XLVI", conversor.converter(46));
        assertEquals("XLVII", conversor.converter(47));
        assertEquals("XLVIII", conversor.converter(48));
        assertEquals("XLIX", conversor.converter(49));
        assertEquals("L", conversor.converter(50));
        assertEquals("LI", conversor.converter(51));
        assertEquals("LII", conversor.converter(52));
        assertEquals("LIII", conversor.converter(53));
        assertEquals("LIV", conversor.converter(54));
        assertEquals("LV", conversor.converter(55));
        assertEquals("LVI", conversor.converter(56));
        assertEquals("LVII", conversor.converter(57));
        assertEquals("LVIII", conversor.converter(58));
        assertEquals("LIX", conversor.converter(59));
        assertEquals("LX", conversor.converter(60));
        assertEquals("LXI", conversor.converter(61));
        assertEquals("LXII", conversor.converter(62));
        assertEquals("LXIII", conversor.converter(63));
        assertEquals("LXIV", conversor.converter(64));
        assertEquals("LXV", conversor.converter(65));
        assertEquals("LXVI", conversor.converter(66));
        assertEquals("LXVII", conversor.converter(67));
        assertEquals("MMMCMXCIX", conversor.converter(3999));
    }
}
