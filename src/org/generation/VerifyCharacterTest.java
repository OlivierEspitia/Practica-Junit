package org.generation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VerifyCharacterTest {
	@Test
	public void testTipoDeCaracter() {
	assertEquals("Number", VerifyCharacter.tipoDeDato("12 street"));
    assertEquals("Mayus", VerifyCharacter.tipoDeDato("Hola"));
    assertEquals("Minus", VerifyCharacter.tipoDeDato("crayoli"));
    assertEquals("Other", VerifyCharacter.tipoDeDato("#ch30"));
	}
}
