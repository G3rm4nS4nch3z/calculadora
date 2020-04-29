package eed.tests.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacionesTest {

	@Test
	void testSumar() {
		System.out.println("sumar");
		 int sumando1 = 9;
		 int sumando2 = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = 17;
		 int result = instance.sumar(sumando1, sumando2);
		 assertEquals(expResult, result);
	 }

	@Test
	void testRestar() {
		System.out.println("restar");
		 int minuendo = 9;
		 int sustraendo = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = 1;
		 int result = instance.restar(minuendo,sustraendo);
		 assertEquals(expResult, result);
		
	}
	
	@Test
	void testRestar1() {
		System.out.println("restar(negativo)");
		 int minuendo = -9;
		 int sustraendo = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = -17;
		 int result = instance.restar(minuendo,sustraendo);
		 assertEquals(expResult, result);
		
	}

	@Test
	void testMultiplicar() {
		System.out.println("multiplicar");
		 int producto1 = 2;
		 int producto2 = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = 16;
		 int result = instance.multiplicar(producto1, producto2);
		 assertEquals(expResult, result);	
	}

	@Test
	void testDividir() {
		System.out.println("dividir");
		 int dividendo =8;
		 int divisor = 4;
		 Operaciones instance = new Operaciones();
		 int expResult = 2;
		 int result = instance.dividir(dividendo,divisor);
		 assertEquals(expResult, result);	
	}
	
	@Test
	void testDividir1() {
		System.out.println("dividir(entre 0)");
		 int dividendo =8;
		 int divisor = 0;
		 Operaciones instance = new Operaciones();
		 int expResult = -1;
		 int result = instance.dividir(dividendo,divisor);
		 assertEquals(expResult, result);	
	}

	
}
