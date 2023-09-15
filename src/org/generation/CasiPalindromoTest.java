package org.generation;

import static org.junit.Assert.*;
import org.junit.Test;

public class CasiPalindromoTest {
	
	@Test
	public void testEsCasiPalindromo() {
		assertFalse(CasiPalindromo.esCasiPalindromo("oso"));	
		assertTrue(CasiPalindromo.esCasiPalindromo("Ver"));
		assertFalse(CasiPalindromo.esCasiPalindromo("Hola"));	
		assertTrue(CasiPalindromo.esCasiPalindromo("ocho"));
		assertFalse(CasiPalindromo.esCasiPalindromo("Veronica"));	
		assertTrue(CasiPalindromo.esCasiPalindromo("anita lavo latina"));
		
	}
}
