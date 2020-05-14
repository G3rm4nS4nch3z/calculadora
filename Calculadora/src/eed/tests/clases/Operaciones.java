package eed.tests.clases;

public class Operaciones {
	// son operaciones
	public int sumar(int sumando1, int sumando2) {
		return (sumando1 + sumando2);
	}

	public int restar(int minuendo, int sustraendo) {
		return (minuendo - sustraendo);
	}

	public int multiplicar(int producto1, int producto2) {
		return (producto1 * producto2);
	}

	public int dividir(int dividendo, int divisor) {
		if (divisor == 0) {
			return -1;
		} else {
			return (dividendo / divisor);
		}
	}
}
