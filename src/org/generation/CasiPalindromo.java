package org.generation;

public class CasiPalindromo {

	 public static boolean esCasiPalindromo(String str) {
		 str = str.replaceAll("\\s", "");
		 
		int cambios = 0;
		int longitud = str.length();

		for (int i = 0; i < longitud / 2; i++) {
			if (str.charAt(i) != str.charAt(longitud - i - 1)) {
				cambios++;
				if (cambios > 1)
					return false;
				
			}
		}
		return cambios == 1;
	}
}
