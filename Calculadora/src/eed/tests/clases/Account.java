/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eed.ejercicios.ut5;

/**
 *
 * @author Nayra Deniz
 */
public class Account {

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	// Atributos de la clase Account
	private String titular;
	private String ccc;
	private double balance = 0;

	// Constructor
	public Account(String nom, String cuenta) {
		this.titular = nom;
		this.ccc = cuenta;
	}

	// MÃ©todo que me devuelve el saldo disponible en cada momento
	public double disponible() {
		return balance;
	}

	/**
	 * Metodo para ingresar cantidades en la cuenta. Modifica el saldo.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		balance = balance + cantidad;
	}

	/**
	 * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede retirar una cantidad negativa.");
		if (disponible() < cantidad)
			throw new Exception("No hay suficiente saldo para retirar la cantidad solicitada.");
		balance = balance - cantidad;
	}

	/**
	 * Inserta un título en la clase descripción. Al ser el título obligatorio, si
	 * es nulo o vacío se lanzará una excepción.
	 *
	 * @param titulo El nuevo título de la descripción.
	 * @throws IllegalArgumentException Si titulo es null, está vacío o contiene
	 *                                  sólo espacios.
	 * 
	 */
	public void setTitulo(String titulo) throws IllegalArgumentException {
		if (titulo == null || titulo.trim().equals("")) {
			throw new IllegalArgumentException("El título no puede ser nulo o vacío");
		} else {
			this.titulo = titulo;
		}
	}

}
