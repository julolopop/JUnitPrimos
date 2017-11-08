package com.example.usuario.junitprimos;

import com.example.usuario.junitprimos.pojo.Primo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Esprimo_isCorrect() throws Exception {
        assertFalse(Primo.EsPrimo(-1));
        assertFalse(Primo.EsPrimo(0));
        assertFalse(Primo.EsPrimo(1));
        assertTrue(Primo.EsPrimo(2));
        assertTrue(Primo.EsPrimo(3));
        assertFalse(Primo.EsPrimo(4));
    }
}