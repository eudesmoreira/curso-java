package com.atm;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testSeRestoDaDivisaoPor3ForZeroRetornaFizz() {
		//entrada
		Integer numero = 3;
		
		//execucao
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actual = fizzBuzz.doFizzBuzz(numero);
		
		//validacao
		Assert.assertEquals("fizz", actual);
		
	}

}
